package AdventureGame;

import java.util.Random;

import org.w3c.dom.events.MouseEvent;

public abstract class BattleLoc extends Location {

    private Monster monster;
    private String award;
    private int maxMonsterPpl;
    Random random = new Random();
    private Weapon weaponAward;
    private Armor armorAward;
    private boolean isAwardCollected;

    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonsterPpl) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonsterPpl = maxMonsterPpl;
        this.isAwardCollected = this.getPlayer().getInventory().isAwardCollected(award);
    }

    public boolean combat(int maxMonsterPpl) {
        int firstHit = random.nextInt(10);
        if (isAwardCollected == false) {
            for (int i = 1; i <= maxMonsterPpl; i++) {
                this.getMonster().setHealth(this.getMonster().getUpdateHealth());
                playerStats();
                monsterStats(i);

                if (firstHit >= 0 && firstHit < 5) {
                    while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                        System.out.print("<F> Fight or <R> Run away: ");
                        String selectCombat = scan.nextLine().toLowerCase();

                        if (selectCombat.equals("f")) {
                            System.out.println("You shot!");
                            this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getDamage());
                            afterHit();
                            if (this.getMonster().getHealth() > 0) {
                                System.out.println();
                                System.out.println(this.getMonster().getName() + " hit you!");
                                int monsterDamage = this.getMonster().getDamage()
                                        - this.getPlayer().getInventory().getArmor().getBlock();
                                if (monsterDamage < 0) {
                                    monsterDamage = 0;
                                }
                                this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                                afterHit();
                            }
                        } else {
                            return false;
                        }
                    }
                } else if (firstHit >= 5 && firstHit < 10) {
                    while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                        System.out.print("<F> Fight or <R> Run away: ");
                        String selectCombat = scan.nextLine().toLowerCase();
                        if (selectCombat.equals("f")) {
                            System.out.println(this.getMonster().getName() + i + " hit you!");
                            int monsterDamage = this.getMonster().getDamage()
                                    - this.getPlayer().getInventory().getArmor().getBlock();
                            if (monsterDamage < 0) {
                                monsterDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                            afterHit();
                            if (this.getPlayer().getHealth() > 0) {
                                System.out.println("You shot!");
                                this.getMonster()
                                        .setHealth(this.getMonster().getHealth() - this.getPlayer().getDamage());
                            }
                        } else {
                            return false;
                        }
                    }
                }
                // while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0)
                // {
                // System.out.print("<F> Fight or <R> Run away: ");
                // String selectCombat = scan.nextLine().toLowerCase();

                // if (selectCombat.equals("f")) {
                // System.out.println("You shot!");
                // this.getMonster().setHealth(this.getMonster().getHealth() -
                // this.getPlayer().getDamage());
                // afterHit();
                // if (this.getMonster().getHealth() > 0) {
                // System.out.println();
                // System.out.println(this.getMonster().getName() + " hit you!");
                // int monsterDamage = this.getMonster().getDamage()
                // - this.getPlayer().getInventory().getArmor().getBlock();
                // if (monsterDamage < 0) {
                // monsterDamage = 0;
                // }
                // this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                // afterHit();
                // }
                // } else {
                // return false;
                // }
                // }
                if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                    // System.out.println("You defeated the enemy!");
                    if (this.getPlayer().getLocation().getName().equals("Mine")) {
                        mineAward();
                    } else {
                        System.out.println("You defeated all enemies in " + this.getPlayer().getLocation().getName());
                        System.out.println("You earned these awards: " + this.getAward() + " and " + " coins ("
                                + this.getMonster().getAward() + ")");

                        // LOCATION AWARD
                        this.getPlayer().getWarrior().getInventory().setAwards(this.getAward());
                        this.getPlayer().printHowManyCollectInfo();

                        // MONEY AWARD
                        this.getPlayer().getWarrior()
                                .setCoin(this.getPlayer().getWarrior().getCoin() + this.getMonster().getAward());

                        System.out.println("You won " + this.getMonster().getAward() + " coins");
                        this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getMonster().getAward());
                        System.out.println("Now you have " + this.getPlayer().getCoin() + " coins");
                        return true;

                    }
                } else
                    return false;
            }
        } else {
            System.out.println(
                    "You already collected the award of " + getName() + ". So you can't go that location anymore.");
            return true;
        }

        return true;
    }

    private void afterHit() {
        System.out.println("Your healthpoint: " + this.getPlayer().getHealth());
        System.out.println("Healthpoint of " + this.getMonster().getName() + ": " + this.getMonster().getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("Player Status");
        System.out.println("------------------");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage: " + this.getPlayer().getDamage());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Coin: " + this.getPlayer().getCoin());
    }

    public void monsterStats(int i) {
        System.out.println("\n" + this.getMonster().getName() + i + " Status");
        System.out.println("------------------");
        System.out.println("Health: " + this.getMonster().getHealth());
        System.out.println("Damage: " + this.getMonster().getDamage());
        System.out.println("Award: " + this.getMonster().getAward());

    }

    @Override
    public boolean onLocation() {
        this.maxMonsterPpl = randomMonsterNumber();
        System.out.println("You are here : " + this.getName());
        System.out.println(
                "Be careful! There are  " + this.maxMonsterPpl + " " + this.getMonster().getName() + " lives here.");
        System.out.println("<F> Fight or <A> Avoid");
        String fightOrAvoid = scan.nextLine().toLowerCase();

        if (fightOrAvoid.equals("f") && combat(maxMonsterPpl)) {
            System.out.println("Start Fighting!");
            if (combat(maxMonsterPpl)) {
                System.out.println("You defeated all the enemies in the " + this.getName());
                return true;
            }
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You died!");
            return false;
        }
        return true;
    }

    private int randomMonsterNumber() {
        Random random = new Random();
        return random.nextInt(this.maxMonsterPpl) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        if (award.equals("random")) {
            this.award = award;
        }
        this.award = null;
    }

    public boolean isAwardCollected() {
        return isAwardCollected;
    }

    public void setAwardCollected(boolean isAwardCollected) {
        this.isAwardCollected = isAwardCollected;
    }

    public void mineAward() {
        System.out.println("You defeated all enemies in " + this.getName());
        int categoryChance = random.nextInt(1, 100);
        int weaponTypeChance = random.nextInt(1, 100);
        int armorTypeChance = random.nextInt(1, 100);
        int moneyAmountChance = random.nextInt(1, 100);

        if (1 <= categoryChance && categoryChance <= 24) {
            // Money(25%)
            if (1 <= moneyAmountChance && moneyAmountChance <= 19) {
                // 10(20%)
                System.out.println("You won 10 coin!");
                this.getPlayer().setCoin(this.getPlayer().getCoin() + 10);
            } else if (20 <= moneyAmountChance && moneyAmountChance <= 49) {
                // 5(30%)
                System.out.println("You won 5 coin!");
                this.getPlayer().setCoin(this.getPlayer().getCoin() + 5);
            } else {
                // 1(50%)
                System.out.println("You won 1 coin!");
                this.getPlayer().setCoin(this.getPlayer().getCoin() + 1);
            }

        } else if (25 <= categoryChance && categoryChance <= 39) {
            // Weapon(15%)
            if (1 <= weaponTypeChance && weaponTypeChance <= 19) {
                // Rifle(20%)
                System.out.println("You have won a rifle!");
                weaponAward = (Weapon) StoreItems.getItemByName("Rifle", Weapon.weapons());
                this.getPlayer().getInventory().setWeapon(weaponAward);
            } else if (20 <= weaponTypeChance && weaponTypeChance <= 49) {
                // Sword(30%)
                System.out.println("You have won a sword!");
                weaponAward = (Weapon) StoreItems.getItemByName("Sword", Weapon.weapons());
                this.getPlayer().getInventory().setWeapon(weaponAward);
            } else {
                // Gun(50%)
                System.out.println("You have won a gun!");
                weaponAward = (Weapon) StoreItems.getItemByName("Gun", Weapon.weapons());
                this.getPlayer().getInventory().setWeapon(weaponAward);
            }
        } else if (40 <= categoryChance && categoryChance <= 54) {
            // Armor(15%)
            if (1 <= armorTypeChance && armorTypeChance <= 19) {
                System.out.println("You have won a heavy armor!");
                armorAward = (Armor) StoreItems.getItemByName("Heavy armor", Armor.armors());
                this.getPlayer().getInventory().setArmor(armorAward);
                // Heavy armor(20%)
            } else if (20 <= armorTypeChance && armorTypeChance <= 49) {
                // Medium armor(30%)
                System.out.println("You have won a medium armor!");
                armorAward = (Armor) StoreItems.getItemByName("Heavy armor", Armor.armors());
                this.getPlayer().getInventory().setArmor(armorAward);
            } else {
                // Light armor(50%)
                System.out.println("You have won a light armor!");
                armorAward = (Armor) StoreItems.getItemByName("Heavy armor", Armor.armors());
                this.getPlayer().getInventory().setArmor(armorAward);
            }

        } else {
            // Nothing(45%)
            System.out.println("You couldn't get an award from Mine :(");
        }

    }

}
