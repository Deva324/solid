package com.zemoso.assignment.java;

/**
 * @author Devendar Reddy
 */
public class Problem2 {

    public static void main(String[] args) {
        System.out.println(isAlphabetic("Abc"));

    }

    /**
     * Verifies the input String contains only alphabets.
     * Time Complexity for this operation will be O(n) where n is length of string.
     * It need to iterate over the length of the string.
     *
     * @param text Text to be verified.
     * @return boolean value
     */
    static boolean isAlphabetic(String text) {
        return text.toLowerCase().chars().filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count() == 26;
    }

}
