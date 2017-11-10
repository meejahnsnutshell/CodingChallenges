package ReverseArrayNov;

public class ReverseArrayNov {

    // write this method "public int[] resverseArray(int[] t)" - this method needs to reverse an array
    // in place - you should only need to use one extra variable.

    public static int[] reverseArray(int[] t){
        // better to define the var outside the forloop, better for memory & we can use it again
        int a;

        // do a for loop to the middle of the array
        for (int i = 0; i < (t.length / 2); i++) {

            // backup the first element by storing it as a var
            a = t[i];
            // assign the end element to the front
            t[i] = t[t.length-1-i];
            // give the variable to the end element
            t[t.length-1-i] = a;
        }
        return t;
    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        reverseArray(x);
        for (int i: x) {
            System.out.println(i);
        }

    }
}
