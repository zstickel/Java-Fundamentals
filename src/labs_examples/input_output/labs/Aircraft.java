package labs_examples.input_output.labs;

public class Aircraft {
    private int speed;
    private String name;
    public enum AircraftType {
        JET,
        PROP
    }
    AircraftType aircraftType;
    String color;

    Aircraft(){
        speed = 110;
        name = "Cessna";
        aircraftType = AircraftType.PROP;
        color = "white";
    }
    Aircraft(int speed, String name, AircraftType aircraftType, String color){
        this.speed = speed;
        this.name = name;
        this.aircraftType = aircraftType;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override public String toString(){
        return name + ", Speed: " + speed + ", Type: " + aircraftType + ", Color: " + color;
    }
}
