package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVParser {
    private String filePath;
    CSVParser(String filePath){
        this.filePath = filePath;
    }

    ArrayList<Aircraft> aircrafts;
    public void csvToStringArray(){

        try(FileReader inputStream = new FileReader(filePath)){
            String l;
            BufferedReader bufferedInput = new BufferedReader(inputStream);
            while((l = bufferedInput.readLine()) != null){

                String[] aircraftAttributes = l.split(",");
                int speed = Integer.parseInt(aircraftAttributes[0]);
                String name = aircraftAttributes[1];
                String type = aircraftAttributes[2];
                String color = aircraftAttributes[3];
                Aircraft.AircraftType aircraftType;
                if (type.equals(" PROP")){
                    aircraftType = Aircraft.AircraftType.PROP;
                }else{
                    aircraftType = Aircraft.AircraftType.JET;
                }
                Aircraft aircraft = new Aircraft(speed,name,aircraftType,color);
                System.out.println(aircraft.toString());

            }
        }catch(Exception exc){

        }

    }
}
