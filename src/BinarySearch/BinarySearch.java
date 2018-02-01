package BinarySearch;

public class BinarySearch {
    /**
     * Takes an array and target element. Starting with the middle of the array, method eliminates half the array from
     * search based on whether target is less than or greater than the middle element.
     * @param arr - sorted array
     * @param target - the element to be found
     * @return targetIndex - the array index of the target element
     */
    public static int findIndex(int[] arr, int target) {
        // this is what we're searching for, -1 indicates element not found
        int targetIndex = -1;
        int arrLength = arr.length;
        // case of only 1 element in array
        if (arrLength == 1) {
            // just check that element
            if (arr[0] == target) {
                // target found, so assign index to targetIndex
                targetIndex = 0;
            }
        } else {
            // for any array size > 1, find the middle index
            int midIndex = (arrLength - 1) / 2;
            // get the element at the middle index
            int midElement = arr[midIndex];
            // check if midElement is the target
            if (midElement == target) {
                targetIndex = midIndex;
            } else if (target > midElement) {
                // iterate down the array to the end if midElement is less than target
                for (int i = midIndex + 1; i <= arrLength - 1; i++) {
                    if (arr[i] == target) {
                        targetIndex = i;
                        break;
                    }
                }
                //iterate up the array to 0 if target < midElement
            } else {
                for (int i = midIndex - 1; i >= 0; i--) {
                    if (arr[i] == target) {
                        targetIndex = i;
                        break;
                    }
                }
            }
        }

        // case where target isn't in the array, and targetIndex was never changed from initial value
        if (targetIndex == -1) {
            System.out.println("The target of " + target + " is not in the array.");
        } else {
            System.out.println("We found the target of " + target + " at Index " + targetIndex + " with value " + arr[targetIndex]);
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        // provide a sorted array
        int[] arr = {3, 5, 7, 9, 15, 17, 25};

        // element to be found
        int target = 25;

        findIndex(arr, target);
    }

}
