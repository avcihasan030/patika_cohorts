package Zoo;

public abstract class Animals {
    private String species;
    private double weight;
    private int age;

    public Animals(String species, double weight, int age) {
        this.species = species;
        this.weight = weight;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public abstract double getDosage();

    public abstract String getFeedSchedule();
}
