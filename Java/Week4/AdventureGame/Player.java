package AdventureGame;

import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private Location location;
    private Warrior warrior;
    private int damage;
    private int health;
    private int coin;
    private String name;
    private int renewHealth;
    public boolean noLocPickedYet = true;
    public boolean isExit = false;
    private Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        Warrior[] warriors = { new Samurai(), new Archer(), new Knight() };
        System.out.println("***********************************************************");
        for (Warrior warrior : warriors) {
            System.out.println("ID: " + warrior.getId() + "\t warrior: " + warrior.getName() + "\t damage: "
                    + warrior.getDamage() + "\t health: "
                    + warrior.getHealth() + "\t coins: " + warrior.getCoin());
        }
        System.out.print("Choose your warrior to start: \n-> ");
        int selectedWarrior = scan.nextInt();

        initPlayer(warriors[selectedWarrior - 1]);
    }

    public void initPlayer(Warrior warrior) {
        this.setDamage(warrior.getDamage());
        this.setHealth(warrior.getHealth());
        this.setCoin(warrior.getCoin());
        this.setName(warrior.getName());
        this.setRenewHealth(warrior.getHealth());
    }

    public void playerInfo() {
        System.out.println(
                "Weapon: " + this.getInventory().getWeapon().getName() +
                        "\nDamage: " + this.getDamage() +
                        "\nArmor: " + this.getInventory().getArmor().getName() +
                        "\nBlock " + this.getInventory().getArmor().getBlock() +
                        "\nHealth: " + this.getHealth() +
                        "\nCoins: " + this.getCoin());

    }

    public void selectLocation(){
        while(noLocPickedYet || location.onLocation()){
            playerInfo();
            System.out.println();
            System.out.println("########## Locations ##########");
            System.out.println();
            System.out.println("1- Safe House ->  Your health will be restore,there are no enemies here.");
            System.out.println("2- Tool Store -> You can buy weapons or armors");
            System.out.println("3- Cave -> Be careful, a zombie may come out!");
            System.out.println("4- Forest -> Be careful, a vampire may come out!");
            System.out.println("5- River -> Be careful, a bear may come out!");
            System.out.println("6- Mine -> Be careful, a snake may come out!");
            System.out.println("0 - EXIT -> Terminate the game");
            System.out.println("***********************************************************");
            System.out.print("Select the location that you want to go: \n-> ");
            int _selectLocation = scan.nextInt();

            switch (_selectLocation) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    location = new SafeHouse(this);
                    break;
                case 2:
                    location = new ToolStore(this);
                    break;
                case 3:
                    location = new Cave(this);
                    break;
                case 4:
                    location = new Forest(this);
                    break;
                case 5:
                    location = new River(this);
                    break;
                case 6:
                    location = new Mine(this);
                    break;
                default:
                    location = new SafeHouse(this);
                    break;
            }

            noLocPickedYet = false;
            if(isExit == true){
                System.out.println("Take it easy. The adventure hasn't done yet...");
                break;
            }

            if(!location.onLocation() || location == null){
                System.out.println("GAME OVER!");
                break;
            }

            //If the player collects all items and they win
            if(this.getInventory().getAwards().size() == this.getLocation().getHowManyBattleLoc()){
                System.out.println("CONGRATULATIONS! you collect all awards in every locations.");
                System.out.println("We are waiting for you again for new adventures :)");
                break;
            }
        }
    }

    public void printHowManyCollectInfo(){
        System.out.println("-------------------");
        System.out.println("Collected items: " + this.getInventory().getAwards().size() + "/" + this.getLocation().getHowManyBattleLoc());
        System.out.println("-------------------");
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getTotalDamage() {
        return getDamage() + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRenewHealth() {
        return renewHealth;
    }

    public void setRenewHealth(int renewHealth) {
        this.renewHealth = renewHealth;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

}
