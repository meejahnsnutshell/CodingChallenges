package LC;

/**
 * LaunchCode challenge to write a program that returns the first available spot in a parking lot. 1's are occupied,
 * 0's are empty parking spaces. Instructions stated that the next available spot should be furthest to the left that
 * is also closest to the top. For example
 * 1 1 1 1 0
 * 0 1 1 1 1
 * should return 1, 0
 */
public class Solution2 {
    /**
     * Method signature provided in instructions
     * @param n, parking lot grid is nxn
     * @param available, nxn array of available spaces
     * @return array containing row and column of next spot to be filled
     */
    static int[] carParking(int n, int[][] available) {

        int[] result = {-1, -1};
        // iterate through array (of 0s and 1s)
        // stop when first 0 is found in each row
        // result[] is row and index of each 0 for each row
        // return row & space of where car should be parked

        for (int i = 0; i < n; i++) {   //column iteration
            for (int j = 0; j < n; j++) {   //row iteration
                if (available[j][i] == 0) { // look for zeros down each column
                    result[0] = j;
                    result[1] = i;
                    System.out.print("A spot is available at ");
                    for (int t: result) {
                        System.out.print(t + " ");
                    }
                    return result;
                }
            }
        }

        if (result[0] == -1) {
            System.out.println("The parking lot is full!");
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] test = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0}
        };

        carParking(5, test);
    }


}
