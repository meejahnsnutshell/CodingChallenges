package CompareArrays.TwoSevens;

public class TwoSevensDemo{

    public static void main(String[] args) {
        // declare an array to pass to checkSeven method.
        // Can modify where the 7's are and re-run code to test that it's working.
        int[] array = {7,2,0,7,6,9};

        // create an object to call checkSevens
        TwoSevens sevens = new TwoSevens();

        // call checkSevens on the array
        sevens.checkSevens(array);

    }


}