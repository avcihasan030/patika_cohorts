package MovieManagementSystem;

public class Main {
    public static void main(String[] args) {
        FilmManagementSystem fms = new FilmManagementSystem();

        Film f1 = new Film("Transporter", 30);
        Film f2 = new Film("Red Notice", 20);
        Film f3 = new Film("Fast and Furious", 50);

        fms.addFilm(f1);
        fms.addFilm(f2);
        fms.addFilm(f3);

        User user1 = new User("Dwayne Johnson");
        User user2 = new User("Jason Statham");

        fms.addUser(user1);
        fms.addUser(user2);

        user1.subscribe();
        user2.buyCredits(100);

        fms.setFilmOnSale("Transporter");
        fms.setFilmOnSale("Red Notice");

        user1.rentAFilm(f1);
        user2.rentAFilm(f1);
        user2.rentAFilm(f2);
        user2.rentAFilm(f3);

        fms.buyFilm(user1, "Fast and Furious");
        fms.buyFilm(user2, "Red Notice");
    }
}
