package BinarySearch;

/**
 * A function that uses binary search steps to find the index of a given element within a sorted array.
 */

public class BinarySearch {

    public static int findIndex(int[] arr, int target){
        // this is what we're searching for, initialized to -1
        int targetIndex = -1;
        // boolean test if we've found the target
        //boolean isTarget = false;
        // get array length
        int arrLength = arr.length;
        // if there's only 1 element
        if (arrLength == 1){
            // just check that element
            if (arr[0] == target){
                targetIndex = 0;
                System.out.println("We found the target of " + target + " at Index " + targetIndex + " with value " + arr[0]);
                //isTarget = true;
                return targetIndex;
            } else {
                System.out.println("The target of " + target + " is not in the array");
            }
            // for any array size > 1
        } else {
            // get the middle index
            int midIndex = (arrLength-1)/2;
            // get the element at midIndex
            int midElement = arr[midIndex];
            // check if midElement equals target
            if (midElement == target){
                //isTarget = true;
                targetIndex = midIndex;
                System.out.println("We found the target of " + target + " at Index " + midIndex + " with value " + arr[midIndex]);
                // iterate down the array to arrLength-1 if midElement is less than target
                return targetIndex;
            } else if (target > midElement){
                for (int i = midIndex + 1; i <= arrLength - 1; i++){
                    if (arr[i] == target){
                        targetIndex = i;
                        System.out.println("We found the target of " + target + " at Index " + targetIndex + " with value " + arr[i]);
                        return targetIndex;
                    }
                }
                //iterate up the array to 0 if target < midElement
            } else {
                for (int i = midIndex - 1; i >= 0; i--){
                    if (arr[i] == target){
                        targetIndex = i;
                        System.out.println("We found the target of " + target + " at Index " + targetIndex + " with value " + arr[i]);
                        return targetIndex;
                    }
                }
            }
        }
        // case where target isn't in the array, and targetIndex was never changed from initial value
        if (targetIndex == -1){
            System.out.println("The target of " + target + " is not in the array.");
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        // provide a sorted array
        int[] arr = {3,5,17,20,25,26,33,1006,4500,4501};

        // element to be found
        int target = 9;

        findIndex(arr, target);
    }

}
