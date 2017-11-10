package CompareArrays.TwoSevens;

public class TwoSevens {

    // we have one array, want to return true if there are two 7's next
    // to each other OR two 7's separated by one element

    public boolean checkSevens(int[] a){
        boolean twoSevens = false;
    // need to iterate through the array:
        for (int i = 0; i < (a.length-2); i++){
            // looking for a 7:
            if (a[i] == 7){
                // if a 7 is found, compare it to next element:
                if (a[i+1] == 7){
                    // if next element is also 7, twoSevens gets true
                    twoSevens = true;
                } else {
                    // if next element is not 7, check next element + 1
                    if (a[i+2] == 7){
                        // if that is 7, gets true
                        twoSevens = true;
                    } else
                        // if not a 7, force next iteration
                        continue;
                    // if not a 7, force next iteration
                } continue;
                // // if not a 7, force next iteration
            } continue;

        }
        // print out & return twoSevens:
        System.out.println(twoSevens);
        return twoSevens;
    }
}



