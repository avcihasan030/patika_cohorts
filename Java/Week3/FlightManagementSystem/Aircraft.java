package FlightManagementSystem;

public class Aircraft {
    private String id;
    private String type;
    private boolean isOperational;

    public Aircraft(String id, String type, boolean isOperational) {
        this.id = id;
        this.type = type;
        this.isOperational = isOperational;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean isOperational) {
        this.isOperational = isOperational;
    }

}
