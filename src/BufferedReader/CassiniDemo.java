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


//        This was my base code that I moved to a method in CassiniData class:
//        create an arraylist to store your POJO results:
//        ArrayList<Cassini> resultList = new ArrayList();
//        // code in the file to be analyzed
//        String file = "/home/the-meej/CodingNomads/Apoapse_Parameters-8.csv";
//
//        String nextLine;
//        String[] vals = null;
//
//        // Create and use a FileReader wrapped in a BufferedReader - file argument is for a path to
//        // a file
//        // the line below is using "try-with-resources to automatically open and close the file"
//        try (BufferedReader br = new BufferedReader(new FileReader(file)))
//        {
//            while((nextLine = br.readLine()) != null)
//            {
//                Cassini data = new Cassini();
//                vals = nextLine.split(",");
//
//                data.setSeq(vals[0]);
//                data.setRev(vals[1]);
//                data.setEpoch(vals[2]);
//                data.setDate(vals[3]);
//                data.setPeriod(Double.parseDouble(vals[4]));
//                data.setInclination(Double.parseDouble(vals[5]));
//                data.setRange(Double.parseDouble(vals[6]));
//
//                resultList.add(data);
//                System.out.println(nextLine);
//            }
//
//        } catch(IOException exc) {
//            System.out.println("I/O Error: " + exc);
//        }

