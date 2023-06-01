package FlightManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightManagementSystem {
    private Map<String, Airport> airports;
    private Map<String, Airline> airlines;
    private List<Flight> flights;

    public FlightManagementSystem() {
        this.airports = new HashMap<>();
        this.airlines = new HashMap<>();
        this.flights = new ArrayList<>();
    }

    public void addAirport(Airport airport) {
        airports.put(airport.getId(), airport);
    }

    public void addAirline(Airline airline) {
        airlines.put(airline.getId(), airline);
    }

    public void scheduleFlight(Flight flight) {
        flights.add(flight);
    }

    public Map<String, Airport> getAirports() {
        return airports;
    }

    public void setAirports(Map<String, Airport> airports) {
        this.airports = airports;
    }

    public Map<String, Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(Map<String, Airline> airlines) {
        this.airlines = airlines;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
