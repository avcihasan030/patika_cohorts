package Zoo;

public class Felines extends Animals{

    public Felines(String species, double weight, int age) {
        super(species, weight, age);
    }

    @Override
    public double getDosage() {
        return 1.5;
    }

    @Override
    public String getFeedSchedule() {
        return "Sabah: 9:00, Öğlen: 13:00, Akşam: 19:00";
    }
    
}
