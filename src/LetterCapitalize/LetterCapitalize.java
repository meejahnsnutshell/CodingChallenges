package LetterCapitalize;

/**
 * Write a function that takes a string and capitalizes the first letter of every word.
 * Words will be separated by only one space.
 */

public class LetterCapitalize {

    public static String letterCaps(String str) {
        // convert String to char Array so we can iterate easily
        char[] chars = str.toCharArray();
        // Check each char in the array
        for (int i = 0; i < chars.length; i++) {
            // capitalize first index automatically
            if (i == 0) {
                // check if 1st index is already uppercase, leave as-is and continue iteration
                if (Character.isUpperCase(chars[i])) {
                    continue;
                    // if not already uppercase, convert to uppercase
                } else {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
            // for all other indices (ie not 0), where a space is found
            if (chars[i] == ' ') {
                // if next letter is already uppercase, continue iterating
                if (Character.isUpperCase(chars[i])) {
                    continue;
                // if not, convert to uppercase
                } else {
                    chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                }
            }
        }
        // convert char[] back to String for easy printing
        str = String.valueOf(chars);
        return str;
    }

    public static void main(String[] args) {
        String str = "this sentence will have capitalized words when letterCaps is done with it.";

        System.out.println("Before method: " + str);
        str = letterCaps(str);
        System.out.println("After method: " + str);
    }

}
