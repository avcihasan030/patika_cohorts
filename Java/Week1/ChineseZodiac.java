import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            short yearOfBirth;

            System.out.print("Enter your year of birth: ");
            yearOfBirth = scan.nextShort();
            findMySign(yearOfBirth);
        }
    }

    private static void findMySign(short yearOfBirth) {
        String[] zodiac = {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};

        switch (yearOfBirth%12) {
            case 0:
                System.out.println("Your chinese zodiac sign is: " + zodiac[0]);
                break;
            case 1:
                System.out.println("Your chinese zodiac sign is: " + zodiac[1]);
                break;
            case 2:
                System.out.println("Your chinese zodiac sign is: " + zodiac[2]); 
                break;
            case 3:
                System.out.println("Your chinese zodiac sign is: " + zodiac[3]);
                break;
            case 4:
                System.out.println("Your chinese zodiac sign is: " + zodiac[4]);
                break;
            case 5:
                System.out.println("Your chinese zodiac sign is: " + zodiac[5]);
                break;
            case 6:
                System.out.println("Your chinese zodiac sign is: " + zodiac[6]); 
                break;
            case 7:
                System.out.println("Your chinese zodiac sign is: " + zodiac[7]); 
                break;
            case 8:
                System.out.println("Your chinese zodiac sign is: " + zodiac[8]); 
                break;
            case 9:
                System.out.println("Your chinese zodiac sign is: " + zodiac[9]); 
                break;
            case 10:
                System.out.println("Your chinese zodiac sign is: " + zodiac[10]); 
                break;
            case 11:
                System.out.println("Your chinese zodiac sign is: " + zodiac[11]); 
                break;
            default:
                break;
        }
    }
}
