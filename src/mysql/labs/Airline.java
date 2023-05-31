package mysql.labs;
import java.sql.*;
public class Airline {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    Airline() {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://x.x.x.x/airline?"
                    + "user=xxxx&password=xxxx"
                    + "&useSSL=false&allowPublicKeyRetrieval=true"
                    + "&noAccessToProcedureBodies=true";


            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection(connectionString);

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        }
    }

    public String getAircraftDestination(String aircraftName){
        Aircraft aircraft = getAircraftByName(aircraftName);
        try {

            preparedStatement = connection
                    .prepareStatement("select destination_number from airline.flights where aircraft_number = ?");
            preparedStatement.setInt(1, aircraft.number);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int destinationNumber = resultSet.getInt("destination_number");
            preparedStatement = connection
                    .prepareStatement("select city from airline.locations where location_number = ?");
            System.out.println("Destination number retrieved:");
            System.out.println(destinationNumber);
            preparedStatement.setInt(1, destinationNumber);

            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String  destination = resultSet.getString("city");
            return  destination;
        }catch (SQLException e){
            System.out.println("Exception occurred");
            e.printStackTrace();
            aircraft = new Aircraft();
            return "Failed to get destination";
        }
    }
    public Boolean insertAircraft(Aircraft aircraft){
        try {
            String name = aircraft.name;
            String type = aircraft.type;
            int speed = aircraft.speed;
            preparedStatement = connection
                    .prepareStatement("INSERT INTO airline.aircraft(name, type, speed) VALUES (?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2,type);
            preparedStatement.setInt(3,speed);
            int rowAffected = preparedStatement.executeUpdate();

            return true;
        }catch (SQLException e){
            System.out.println("Exception occurred");
            e.printStackTrace();
            aircraft = new Aircraft();
            return false;
        }
    }

    public Aircraft getAircraftByName(String name){
        Aircraft aircraft;
        String query = "select * from airline.aircraft where name = '" + name + "'";
        try {

           preparedStatement = connection
                    .prepareStatement("select * from airline.aircraft where name = ?");
            preparedStatement.setString(1, name);

            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int aircraftNumber = resultSet.getInt("aircraft_number");
            String aircraftName = resultSet.getString("name");
            String type = resultSet.getString("type");
            int speed = resultSet.getInt("speed");
            aircraft = new Aircraft(aircraftNumber, aircraftName, type, speed);
            return aircraft;
        }catch (SQLException e){
            System.out.println("Exception occurred");
            e.printStackTrace();
            aircraft = new Aircraft();
            return aircraft;
        }
    }
    public boolean createPassenger(){

        return true;
    }
    protected void finalize(){
        try {
            // close all JDBC elements
            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
