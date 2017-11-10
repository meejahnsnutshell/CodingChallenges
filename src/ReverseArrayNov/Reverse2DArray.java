package ReverseArrayNov;

public class Reverse2DArray {

    // write this method "public int[][] reverse2DArray(int[][] t)"
    // this method needs to reverse a 2D array in place, using only one extra variable.
    // very last element should be very first element
    // need to stop iterating halfway through the outer length and the inner length

    public static int[][] reverse2DArray(int[][] t){
        // nested for loop
        // how to figure out middle element to stop iterating?
        // this will only work if odd length
        for (int i = 0; i < (t.length / 2); i++){
            for (int j = 0; j < (t[i].length); j++){
                // store first element to a var
                int a = t[i][j];
                // give last element to first
                t[i][j] = t[t.length-1-i][j];
                // give var to last element
                t[t.length-1-i][j] = a;
            }
        }
        return t;
    }

    public static void main(String[] args) {

        int[][] x = {{1,2,3,4,5},{6,7,8,9,10}};

        reverse2DArray(x);

        for (int[] i: x) {
            for (int j: i) {
                System.out.println(j);
            }
        }
    }
}
