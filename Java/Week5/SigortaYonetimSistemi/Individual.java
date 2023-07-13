package SigortaYonetimSistemi;

public class Individual extends Account {

    public Individual(User user) {
        super(user);
    }

    @Override
    public void showInsuranceInfo() {
        for (Insurance insurance : insurances) {
            System.out.println("Insurance Name: " + insurance.getName());
            System.out.println("Insurance Fee: " + insurance.getFee());
            System.out.println("Insurance Start Date: " + insurance.getStartDate());
            System.out.println("Insurance End Date: " + insurance.getEndDate());
            System.out.println();
        }
    }

}
