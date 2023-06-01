package Zoo;

public class Rodents extends Animals {

    public Rodents(String species, double weight, int age) {
        super(species, weight, age);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getDosage() {
        return 3.0;
    }

    @Override
    public String getFeedSchedule() {
        return "Sabah: 6:00, Öğlen: 12:00, Akşam: 20:00";
    }

}
