package javaprogrammes;
/* Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.
11.
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme_10_LondonUndergroundLines {

    public static void main(String[] args) {
        // Create a map of Zone 1 stations and their corresponding tube lines
        Map<String, String> stationToLine = new HashMap<>();
        stationToLine.put("Victoria", "Victoria Line");
        stationToLine.put("Oxford Circus", "Bakerloo Line, Central Line, Victoria Line");
        stationToLine.put("Waterloo", "Bakerloo, Jubilee Line, Northen Line, Waterloo & City Line"  );

        // Input the station name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a Zone 1 station ");
        String station = scanner.nextLine();

        // check if the station is in the map
        if (stationToLine.containsKey(station)) {
            String lines = stationToLine.get(station);
            System.out.println("The following lines pass through " + station + " : " + lines);
        } else {
            System.out.println("Sorry, we don't have information for that station in zone 1. ");
        }
        scanner.close();
    }
}
