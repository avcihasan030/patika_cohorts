package FlightManagementSystem;

public class Main {
    public static void main(String[] args) {
        FlightManagementSystem system = new FlightManagementSystem();

        Airport airport1 = new Airport("A1", "Havalimanı 1");
        Airport airport2 = new Airport("A2", "Havalimanı 2");
        system.addAirport(airport1);
        system.addAirport(airport2);

        Airline airline1 = new Airline("L1");
        Airline airline2 = new Airline("L2");
        system.addAirline(airline1);
        system.addAirline(airline2);

        Aircraft aircraft1 = new Aircraft("AC1", "Uçak Tipi 1", true);
        Aircraft aircraft2 = new Aircraft("AC2", "Uçak Tipi 2", true);
        airline1.addAircraft(aircraft1);
        airline2.addAircraft(aircraft2);

        Pilot pilot1 = new Pilot("Pilot 1", 3);
        Pilot pilot2 = new Pilot("Pilot 2", 5);
        airline1.addPilot(pilot1);
        airline2.addPilot(pilot2);

        Flight flight1 = new Flight("F1", airline1.getId(), airport1.getId(), airport2.getId(), "12:00", "14:00", pilot1, pilot2);
        system.scheduleFlight(flight1);
    }
}
