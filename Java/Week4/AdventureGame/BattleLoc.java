package AdventureGame;

import java.util.Random;

public abstract class BattleLoc extends Location {

    private Monster monster;
    private String award;
    private int maxMonsterPpl;

    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonsterPpl) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonsterPpl = maxMonsterPpl;
    }

    public void combat() {
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are here : " + this.getName());
        System.out.println(
                "Be careful! There are  " + this.maxMonsterPpl + " " + this.getMonster().getName() + " lives here.");
        System.out.println("<F> Fight or <A> Avoid");
        String fightOrAvoid = scan.nextLine();
        fightOrAvoid = fightOrAvoid.toLowerCase();

        if (fightOrAvoid.equals("f")) {
            System.out.println("Start Fighting!");
        } else if (fightOrAvoid.equals("a")) {
            System.out.println("You fucking coward!");
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
        this.award = award;
    }

}
