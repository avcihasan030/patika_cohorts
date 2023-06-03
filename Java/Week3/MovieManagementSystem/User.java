package MovieManagementSystem;

public class User {
    private String userName;
    private boolean subscriber;
    private int credit;

    public User(String userName) {
        this.userName = userName;
        this.subscriber = false;
        this.credit = 0;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean isSubscriber() {
        return this.subscriber;
    }

    public void subscribe() {
        this.subscriber = true;
    }

    public int getCredits() {
        return this.credit;
    }

    public void buyCredits(int amount) {
        this.credit += amount;
    }

    public void hireAFilm(Film film) {
        if (film.isOnSale() && subscriber && credit >= film.getPriceOfHiring()) {
            this.credit -= film.getPriceOfHiring();
            System.out.println(film.getName() + " is successfully rented");
        } else {
            System.out.println(
                    "Something went wrong.To buy this film, you have to be a subscriber or the film must be on sale or you need to have enough credits.");
        }
    }
}
