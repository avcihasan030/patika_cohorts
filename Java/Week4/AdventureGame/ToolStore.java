package AdventureGame;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Tool Store");
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean onLocation() {
        System.out.println("---------- Welcome to the tool store! ----------");
        boolean displayMenu = true;

        while (displayMenu) {
            System.out.println("1- Weapons");
            System.out.println("2- Armors");
            System.out.println("3- Exit");

            int selectCase = Location.scan.nextInt();

            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Invalid input!, pls try again: ");
                System.out.print("-> ");
                selectCase = scan.nextInt();
            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Look forward to see you again!");
                    displayMenu = false;
                    return true;

            }
        }

        return super.onLocation();
    }

    private void printWeapon() {
        System.out.println(" ----- Weapons ----- ");
        System.out.println();

        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + ":  <damage = " + w.getDamage() + " , price = "
                    + w.getPrice() + ">");
        }
        System.out.println("0 - EXIT");
    }

    private void printArmor() {
        System.out.println(" ----- Armors ----- ");
        System.out.println();

        for (Armor a : Armor.armors()) {

            System.out.println(a.getId() + " - " + a.getName() + ":  <block = " + a.getBlock() + " , price = "
                    + a.getPrice() + ">");
        }
        System.out.println("0 - EXIT");
    }

    public void menu() {
    }

    public void buyWeapon() {
        System.out.println();
        System.out.println("Choose a weapon:");
        int selectWeaponId = scan.nextInt();
        while (selectWeaponId < 0 || selectWeaponId > Weapon.weapons().length) {
            System.out.println("Invalid input! Please try agin:");
            selectWeaponId = scan.nextInt();
        }

        if (selectWeaponId != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponId);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("Not enough coins!");
                } else {
                    // satın almanın gerçekleştiği alan
                    System.out.println("You bought " + selectedWeapon.getName());
                    int balance = this.getPlayer().getCoin() - selectedWeapon.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Remaining coins: " + this.getPlayer().getCoin());
                    System.out.println("Previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Current weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }

    public void buyArmor() {
        System.out.println();
        System.out.println("Choose an armor: ");
        int selectArmorId = scan.nextInt();
        while (selectArmorId < 0 || selectArmorId > Armor.armors().length) {
            System.out.println("Invalid input! Please try again: ");
            selectArmorId = scan.nextInt();
        }

        if (selectArmorId != 0) {
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("Not enough coins!");
                } else {
                    // satın almanın gerçekleştiği alan
                    System.out.println("You bought " + selectedArmor.getName());
                    int balance = this.getPlayer().getCoin() - selectedArmor.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Remaining coins: " + this.getPlayer().getCoin());
                    System.out.println("Previous Armor: " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Current Armor: " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }
    }

}
