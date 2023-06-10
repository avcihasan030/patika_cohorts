package AdventureGame;

import java.util.Scanner;

public class Player {
    Inventory inventory;
    private int damage;
    private int health;
    private int coin;
    private String name;
    private Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
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
    }

    public void selectLocation() {

    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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

}
