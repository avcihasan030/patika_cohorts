package Zoo;

public class Horses extends Animals{

    public Horses(String species, double weight, int age) {
        super(species, weight, age);
    }
    
    @Override
    public double getDosage() {
        return 0.0;
    }

    @Override
    public String getFeedSchedule() {
        return "Sabah: 8:00, Öğlen: 12:00, Akşam: 18:00";
    }
}
