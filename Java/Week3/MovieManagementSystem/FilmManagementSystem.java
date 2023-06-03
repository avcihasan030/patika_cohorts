package MovieManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class FilmManagementSystem {
    private List<Film> filmList;
    private List<User> userList;

    public FilmManagementSystem() {
        this.filmList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }

    public void addFilm(Film film) {
        filmList.add(film);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void setFilmOnSale(String filmName) {
        for (Film film : filmList) {
            if (film.getName().equals(filmName)) {
                film.setIsOnSale(true);
                System.out.println(filmName + " is mow on sale");
                return;
            }
        }
        System.out.println("Invalid film name!");
    }

    public void buyFilm(User username, String filmName) {
        Film buyedFilm = null;
        for (Film film : filmList) {
            if (film.getName().equals(filmName)) {
                buyedFilm = film;
                break;
            }
        }

        if (buyedFilm != null && username.getCredits() >= buyedFilm.getPriceOfBuying()) {
            username.buyCredits((int) -buyedFilm.getPriceOfBuying());
            System.out.println(filmName + " is bought successfully");
        } else {
            System.out.println("Something went wrong!");
        }
    }

    public void listMovies() {
        for (Film film : filmList) {
            System.out.println(film);
        }
    }

    public void sortMovies() {
        filmList.sort(null);
    }
}
