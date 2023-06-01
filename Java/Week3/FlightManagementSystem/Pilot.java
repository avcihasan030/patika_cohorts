package FlightManagementSystem;

public class Pilot {
    private String name;
    private int experienceLevel;

    public Pilot(String name, int experienceLevel) {
        this.name = name;
        this.experienceLevel = experienceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

}
