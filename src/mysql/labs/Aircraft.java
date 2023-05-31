package mysql.labs;

public class Aircraft {
    int number;
    String name;
    String type;
    int speed;
    Aircraft(int number, String name, String type, int speed){
        this.number = number;
        this.name = name;
        this.speed = speed;
        this. type = type;
    }
    Aircraft(){
        number = 99;
        name = "Default";
        speed = 110;
        type = "C172";
    }
    public String printAircraft(){
        return "Aircraft " + name + " is a " + type + ", aircraft number " + number + ", Speed: " + speed;
    }
    public String getTravelTime(double distance){
        double time = distance / (double) speed;
        return time + " hours";
    }
}
