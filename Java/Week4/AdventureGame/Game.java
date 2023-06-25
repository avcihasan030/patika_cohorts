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
        System.out.println("Selected warrior info: ");
        System.out.println("name: " + player.getName() +
                "\t damage : " + player.getDamage() + "\t health: " + player.getHealth() + "\t coin: "
                + player.getCoin());

        Location location = null;

        while (true) {
            player.playerInfo();
            System.out.println();
            System.out.println("########## Locations ##########");
            System.out.println();
            System.out.println("1- Safe House ->  this is a safe house for you,there are no enemies here.");
            System.out.println("2- Tool Store -> You can buy weapons or armors");
            System.out.println("3- Cave -> Be careful, a zombie may come out!");
            System.out.println("4- Forest -> Be careful, a vampire may come out!");
            System.out.println("5- River -> Be careful, a bear may come out!");
            System.out.println("0 - EXIT -> Terminate the game");
            System.out.print("Select the location that you want to go: \n-> ");
            int _selectLocation = scan.nextInt();

            switch (_selectLocation) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (location == null) {
                System.out.println("You quickly gave up on this dark and foggy island...");
                return;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
