package CompareArrays.FirstAndLastCompare;

public class FirstAndLastCompare {

    // given this method signature:
    public static boolean firstAndLastCompare(int[] a, int[] b){

        boolean firstSame;
        boolean lastSame;
        // initialize this as false. If no conditions below are met, it stays false.
        boolean matchingElements = false;

        // check if first element of both arrays are the same:
        if (a[0] == b[0]){
            // if true:
            firstSame = true;
        } else {
            // if false:
            firstSame = false;
        }

        // check if last element of both are the same
        if (a[a.length-1] == b[b.length-1]){
            // if true:
            lastSame = true;
        } else {
            // if false:
            lastSame = false;
        }

        // then check if both firstSame & lastSame are true:
        if (firstSame && lastSame){
            // if both elements are equal this gets true:
            matchingElements = true;
        }

        // print out and return the result:
        System.out.println(matchingElements);
        return matchingElements;
    }

    public static class firstAndLastCompareDemo {

        public static void main(String[] args) {

            // initialize two arrays to test on the method:

            int[] arr1 = {1,2,3,4,5};
            int[] arr2 = {1,4,3,2,5};

            // call the method directly because we're in an inner class:
            firstAndLastCompare(arr1, arr2);

        }

    }
}
