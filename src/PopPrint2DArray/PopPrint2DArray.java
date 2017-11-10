package PopPrint2DArray;

public class PopPrint2DArray {

    // write this method "public void populateAndPrint2DArray()" - it should populate a 2D array in
    // one nested loop - then in a second nested loop it should print out each number in the 2D array.

    public static void populateAndPrint2DArray(){
        // declare an array to use
        int[][] a = new int[5][5];
        int count = 0;

//        // do nested for loops to fill the 2d array with ints
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                a[i][j] = j;
//            }
//        }

        // populate array this way to demo more knowledge:
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j ++){
                a[i][j] = count;
                count++;
            }
        }

//        // do nested for loops to print out each element of the 2d array
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[i].length; j++){
//                System.out.print(a[i][j]);
//            }
//        }

        // can do nested for now that array is populated:
        for (int[] x: a) {
            for (int y: x)
                System.out.println(y);
        }
    }

    public static void main(String[] args) {
        populateAndPrint2DArray();
    }

}
