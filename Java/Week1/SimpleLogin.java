import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String _userName, _password;

        System.out.print("Input username: ");
        _userName = inp.nextLine();

        System.out.print("Input password: ");
        _password = inp.nextLine();


        //check if username and password are correct
        if (_userName.equals("patika") && _password.equals("java123")) {
            System.out.println("Logged-in successfully!");
        } else {
            String response;
            System.out.println("Invalid username or password! But i won't tell you which one :) ");
            System.out.println("Would you like to reset your password? (Y/N): ");//ask user to reset password
            System.out.print("-> ");
            response = inp.nextLine();
            
            if (response.endsWith("Y") || response.equals("y")) {
                String newPassword;
                System.out.print("Input your new password: ");
                newPassword = inp.nextLine();

                if (!newPassword.equals("java123")) {
                    System.out.println("Your password created successfully.");
                    return;
                } else {
                    System.out.println("Please input different password than the older one!");
                    return;
                }
            } else if (response.equals("N") || response.equals("n")) {
                System.out.println("You're redirected to the login page...");
                return;
            } else
                System.out.println("Something got wrong!");
            return;
        }
    }

}
