package AdventureGame;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Safe House");
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean onLocation() {
        System.out.println("You're in the safe house!");
        System.out.println("Your health point renewed.");
        return super.onLocation();
    }

    

}
