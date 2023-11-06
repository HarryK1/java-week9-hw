package javahomework;

import java.util.HashMap;

/*
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_LondonTubeLines {

    public static void trainLines() {
        //Create a map to store stations and the lines they belong to
        HashMap<String, String> stationLines = new HashMap<>();

        //Add stations in Zone 1 and the lines they belong to
        stationLines.put("King's Cross St Pancras", "Northern Line, Piccadilly Line, Victoria Line");
        stationLines.put("Oxford Circus", "Bakerloo Line, Central Line, Victoria Line");
        stationLines.put("Waterloo", "Bakerloo Line, Jubliee Line, Northern Line, Waterloo & City Line");

        //specify the station you want to query
        String stationToQuery = "King's Cross St Pancras";

        //Check if the station is in Zone 1 and, if so, list the lines that pass through it
        if (stationLines.containsKey(stationToQuery)){
            String lines = stationLines.get(stationToQuery);
            System.out.println("Lines passing through " + stationToQuery + ":" + lines);
        }
        else {
            System.out.println(stationToQuery + " is not a Zone 1 station or does not exist in our database.");
        }
    }

    public static void main(String[] args) {
        trainLines();
    }
}

