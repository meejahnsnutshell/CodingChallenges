package BufferedReader;

import java.util.ArrayList;

/*
This program reads data from a .csv file, line by line. On each line, data is delimited by commas and
assigned to the corresponding variable.
*/

public class CassiniDemo {

    public static void main(String[] args) {

        // vars that we will determine based on the data:
        double sumPeriod = 0;
        double sumInclination = 0;
        double avgInclination = 0;

        // calling the method & storing the data in an ArrayList:
        ArrayList<Cassini> cassiniData = CassiniData.storeDataFromFile();

        // iterate through every element in Cassini object in the ArrayList cassiniData:
        for (Cassini ob : cassiniData){
            // call getPeriod of every object and add them up:
            sumPeriod += ob.getPeriod();
            // do the same for inclination:
            sumInclination += ob.getInclination();
            // calculate the average inclination:
            avgInclination = sumInclination / cassiniData.size();
        }
        // print results:
        System.out.println("The sum of period is " + sumPeriod + ".");
        System.out.println(" The average inclination is " + avgInclination);

    }
}