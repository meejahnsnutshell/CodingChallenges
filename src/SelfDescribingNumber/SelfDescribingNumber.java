package SelfDescribingNumber;

public class SelfDescribingNumber {

    public static boolean isSelfDescribingNum(int num){
        boolean isSelfDescribing = false;
        // convert int to String to extract individual digits
        String numStr = Integer.toString(num);
        // get length of string
        int numLength = numStr.length();
        // iterate through all digits of String
        for (int i = 0; i < numLength; i++){
            // start the counter at 0 on each new loop
            int count = 0;
            // get the digit at index i, which is # of times the index number must appear to be self-describing
            int numOccurences = Character.getNumericValue(numStr.charAt(i));
            // loop from beginning to compare to all digits
            for (int j = 0; j < numLength; j++){
                //get the digit at index j
                int digit = Character.getNumericValue(numStr.charAt(j));
                //increase count every time we find the index number i as a digit
                if (i == digit){
                    count++;
                    // if count ever becomes greater than numOccurences we can exit because this num
                    // can't be a self-describing number
                    if (count > numOccurences){
                        // return isSelfDescribing as false and exit method
                        isSelfDescribing = false;
                        return isSelfDescribing;
                    }
                }
            }
            // Whenever the count is equal to the number of occurrences for the particular index i, we set this to true
            if (count == numOccurences){
                isSelfDescribing = true;
                continue;
            }
        }
        return isSelfDescribing;
    }
    
    public static void main(String[] args) {
        System.out.println(isSelfDescribingNum(1210));
        System.out.println(isSelfDescribingNum(123456));
    }
}
