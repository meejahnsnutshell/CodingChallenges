package LC;

import java.util.Arrays;

public class Solution1 {
    static int permutate(String string1, String string2) {

        if (string1.length() != string2.length()){
            return 0;
        }
        // change to char arrays
        char[] string1CharArray = string1.toCharArray();
        char[] string2CharArray = string2.toCharArray();
        // sort both
        Arrays.sort(string1CharArray);
        Arrays.sort(string2CharArray);

        boolean isPermutation = Arrays.equals(string1CharArray, string2CharArray);
        if (isPermutation == true){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String string1 = "stRinG1";
        String string2 = "1GniRts";
        System.out.println(permutate(string1, string2));
    }

}
