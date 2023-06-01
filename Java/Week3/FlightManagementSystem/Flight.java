package FlightManagementSystem;

public class Flight {
    private String id;
    private String airlineId;
    private String departureAirportId;
    private String arrivalAirportId;
    private String departureTime;
    private String arrivalTime;
    private Pilot pilot;
    private Pilot coPilot;

    public Flight(String id, String airlineId, String departureAirportId, String arrivalAirportId, String departureTime,
            String arrivalTime, Pilot pilot, Pilot coPilot) {
        this.id = id;
        this.airlineId = airlineId;
        this.departureAirportId = departureAirportId;
        this.arrivalAirportId = arrivalAirportId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.pilot = pilot;
        this.coPilot = coPilot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public String getDepartureAirportId() {
        return departureAirportId;
    }

    public void setDepartureAirportId(String departureAirportId) {
        this.departureAirportId = departureAirportId;
    }

    public String getArrivalAirportId() {
        return arrivalAirportId;
    }

    public void setArrivalAirportId(String arrivalAirportId) {
        this.arrivalAirportId = arrivalAirportId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Pilot getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(Pilot coPilot) {
        this.coPilot = coPilot;
    }

}
