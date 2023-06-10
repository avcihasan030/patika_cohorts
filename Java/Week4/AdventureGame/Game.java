package AdventureGame;

import java.util.Scanner;

public class Game {

    private Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Adventure Game!");

        Player player = new Player("Vaas Montenegro");
        System.out.println("Welome to this dark and foggy island, " + player.getName() + ".");
        System.out.println("Everything that happens here is real...");
        player.selectChar();
        System.out.println("Seçilen karakter bilgileri: ");
        System.out.println("name: " + player.getName() +
                "\t damage : " + player.getDamage() + "\t health: " + player.getHealth() + "\t coin: "
                + player.getCoin());

        Location location = null;

        while (true) {
            System.out.println();
            System.out.println("########## Locations ##########");
            System.out.println();
            System.out.println("1- Safe House ->  this is a safe house for you,there are no enemies here.");
            System.out.println("2- Tool Store -> You can buy weapons or armors");
            System.out.print("Select the location that you want to go: \n-> ");
            int _selectLocation = scan.nextInt();

            switch (_selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
