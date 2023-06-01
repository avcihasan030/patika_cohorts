package FlightManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String id;
    private List<Aircraft> aircraftlist;
    private List<Pilot> pilotList;

    public Airline(String id) {
        this.id = id;
        this.aircraftlist = new ArrayList<>();
        this.pilotList = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        aircraftlist.add(aircraft);
    }

    public void addPilot(Pilot pilot) {
        pilotList.add(pilot);
    }

    public List<Aircraft> getAircraftlist() {
        return aircraftlist;
    }

    public List<Pilot> getPilotList() {
        return pilotList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAircraftlist(List<Aircraft> aircraftlist) {
        this.aircraftlist = aircraftlist;
    }

    public void setPilotList(List<Pilot> pilotList) {
        this.pilotList = pilotList;
    }
}
