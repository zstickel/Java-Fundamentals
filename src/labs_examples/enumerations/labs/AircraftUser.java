package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

enum AircraftCategory {
    AIRPLANE("This one is a regular airplane with wings"),
    ROTORCRAFT("This one is a helicopter"),
    GLIDER("This one is a glider"),
    LIGHTERTHANAIR("This one is filled with gas"),
    POWEREDPARACHUTE("This one is a flying parachute"),
    WEIGHTSHIFTCONTROL("No one knows what this one is"),
    ROCKET("This one is a rocket and goes to the moon");
    private String description;
    AircraftCategory(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class AircraftUser {
    public static void main(String[] args) {
        AircraftCategory category = AircraftCategory.GLIDER;
        AircraftCategory category2 = AircraftCategory.AIRPLANE;
        AircraftCategory category3 = AircraftCategory.ROCKET;
        AircraftCategory category4 = AircraftCategory.ROTORCRAFT;
        System.out.println(category.getDescription());
        checkEngine(category);
        System.out.println(category2.getDescription());
        checkEngine(category2);
        System.out.println(category3.getDescription());
        checkEngine(category3);
        System.out.println(category4.getDescription());
        checkEngine(category4);

    }
    public static void checkEngine(AircraftCategory category){
        switch(category) {
            case GLIDER:
                System.out.println("No engine");
                break;
            case AIRPLANE:
                System.out.println("Engine with fixed wing");
                break;
            case ROTORCRAFT:
                System.out.println("Engine with rotors");
                break;
            default:
                System.out.println("Engine");
                break;
        }
    }

}