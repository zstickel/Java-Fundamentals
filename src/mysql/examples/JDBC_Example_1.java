package mysql.examples;

import java.sql.*;
import java.util.ArrayList;

// NOTE: This is more or less a copy of the example shown here on the platform
// here: https://platform.codingnomads.co/learn/mod/page/view.php?id=2132

public class JDBC_Example_1 {


    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Course> retList = new ArrayList();
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://*.*.*.*/college?"
                    + "user=****&password=****"
                    + "&useSSL=false&allowPublicKeyRetrieval=true"
                    + "&noAccessToProcedureBodies=true";


            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection(connectionString);

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
          //  int x = statement.executeUpdate("INSERT INTO college.courses (name, units) VALUES ('geology', 3)");
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("select * from college.courses");

            // loop through the result set while there are more records
            while (resultSet.next()) {
                Course c = new Course();
                // get the id, name and units fields from the result set and assign them to local variables
                int id = resultSet.getInt("id");
                c.setId(id);
                String name = resultSet.getString("name");
                c.setName(name);
                int units = resultSet.getInt("units");
                c.setUnits(units);
                retList.add(c);

                // print out the result
                //System.out.println("Course ID: " + id + " is " + name + " and is worth " + units + " units");
            }
            System.out.println("Courses: ");
            for(Course course: retList){
                System.out.println(course.toString());
            }
            PreparedStatement preparedStatement = connection
                    .prepareStatement("select * from college.courses where name = ?");
            preparedStatement.setString(1, "history");

            resultSet = preparedStatement.executeQuery();


// print out results

            while (resultSet.next()) {
                System.out.println("Course retrieved :");
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("units"));
            }
            CallableStatement stmt=connection.prepareCall("{call college.GetAllCourses()}");
            boolean results = stmt.execute();
            System.out.println("Result: " + results);

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
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
}