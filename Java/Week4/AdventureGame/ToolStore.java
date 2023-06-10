package AdventureGame;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Tool Store");
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean onLocation() {
        System.out.println("---------- Welcome to the tool store! ----------");
        System.out.println("1- Weapons");
        System.out.println("2- Armors");
        System.out.println("3- Exit");

        int selectCase = Location.scan.nextInt();

        while (selectCase < 1 || selectCase > 2) {
            System.out.println("Invalid input!, pls try again: ");
            System.out.print("-> ");
            selectCase = scan.nextInt();
        }

        switch (selectCase) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Look forward to see you again!");
                return true;

        }

        return super.onLocation();
    }

    private void printArmor() {
        System.out.println("Armors");
    }

    private void printWeapon() {
        System.out.println("Weapons");
    }

    public void menu() {
    }

    public void buy() {
    }

}
