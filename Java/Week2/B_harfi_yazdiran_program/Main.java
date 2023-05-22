package B_harfi_yazdiran_program;

public class Main {
    public static void main(String[] args) {
        // define variables
        String[][] _b = new String[7][4];

        // make loops
        for (int i = 0; i < _b.length; i++) {
            for (int j = 0; j < _b[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    if (i == 3 && j == 3) {
                        _b[i][j] = " ";// make ant indentation at index _b[3][3] to the shape resembles the letter B
                        break;
                    }
                    _b[i][j] = "* ";
                } else if (j == 0 || j == 3) {
                    _b[i][j] = "* ";
                } else
                    _b[i][j] = "  ";
            }
        }

        // display the shape on the screen
        for (int i = 0; i < _b.length; i++) {
            for (int j = 0; j < _b[i].length; j++) {
                System.out.print(_b[i][j]);
            }
            System.out.println();
        }
    }
}
