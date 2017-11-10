package ReverseArray.ReverseVarArgsArray;

public class ReverseArray {

    public static void main(String[] args) {
        // args is array of user input, this is meant to be run from the command line

        // do a for loop that iterates through half the index of args
        // if you don't do half, when you get to the middle you undo the swapping
        for (int i = 0; i < (args.length / 2); i++) {
            String temp;
            // temp gets the value of current element:
            temp = args[i];
            // the current element gets the value of the last element (as we iterate it moves in by one)
            args[i] = args[args.length - 1 - i];
            // the last element gets temp:
            args[args.length - 1 - i] = temp;
        }

        // print all elements after swapping:
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}

// As you do this iteration, you start at opposite ends of the array, swap values, then move
// in one from both directions, swap again, and stop when you're in the center of the array. If
// array is odd length, center value will stay where it is.