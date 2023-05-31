package mysql.labs;
import mysql.examples.Course;

import java.sql.*;
import java.util.ArrayList;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

public class Exercise_04 {

    public static void main(String[] args) {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */

        Airline delta = new Airline();
        Aircraft aircraft = delta.getAircraftByName("Granite");
        System.out.println(aircraft.printAircraft());
        System.out.println("Travel time to go 1000 miles:");
        System.out.println(aircraft.getTravelTime(1000.0));
        Aircraft f16 = new Aircraft(98,"Falcon","F16",600);
         Boolean didInsert = delta.insertAircraft(f16);
         System.out.println(("Was F16 inserted? "));
        System.out.println(didInsert);
        String destination = delta.getAircraftDestination("Granite");
        System.out.println("Aircraft destination: ");
        System.out.println(destination);



    }

}
