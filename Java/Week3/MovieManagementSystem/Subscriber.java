package MovieManagementSystem;

public class Subscriber extends User{

    private int credit;

    public Subscriber(String userName,int credit) {
        super(userName);
        this.credit = credit;
    }

    public void hireAFilm(Film film) {
        if (film.isOnSale() && credit >= film.getPriceOfHiring()) {
            this.credit -= film.getPriceOfHiring();
            System.out.println(film.getName() + " is successfully rented");
        } else {
            setRequest();
            requested.add(film.getName());
            System.out.println(
                    "Something went wrong.To buy this film, you have to be a subscriber or the film must be on sale or you need to have enough credits.");
        }
    }
    
}
