package SigortaYonetimSistemi;

public class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException() {
        super("Invalid email or password!");
    }
}
