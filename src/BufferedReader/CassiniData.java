package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CassiniData {

    // This method reads a .csv file by line. It returns that info as an Array List,
    // after filling it with data from file, so we can use it elsewhere to sum values, etc:

    public static ArrayList<Cassini> storeDataFromFile(){

        // create an arraylist to store your POJO results:
        ArrayList<Cassini> resultList = new ArrayList();

        // code in the file to be analyzed
        String file = "/home/the-meej/CodingNomads/Apoapse_Parameters-8.csv";

        String nextLine;
        String[] vals = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            // while there is another line to read..
            while((nextLine = br.readLine()) != null)
            {
                // Create an object of type Cassini(POJO class) but don't pass it any variables:
                Cassini data = new Cassini();
                // set String[] vals to delimit at each comma in the .csv file:
                vals = nextLine.split(",");

                // call the setters on object data (per line) and assign it to the specified index
                // of array vals (each setter corresponds to a column in the csv file):
                data.setSeq(vals[0]);
                data.setRev(vals[1]);
                data.setEpoch(vals[2]);
                data.setDate(vals[3]);
                data.setPeriod(Double.parseDouble(vals[4]));
                data.setInclination(Double.parseDouble(vals[5]));
                data.setRange(Double.parseDouble(vals[6]));

                // add this "line" of info to resultList (our ArrayList):
                resultList.add(data);

                //  to print each full line in the arrayList:
                //  System.out.println(nextLine);
            }

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        // return the list, which we'll save when calling this method.
        return resultList;
    }

}
