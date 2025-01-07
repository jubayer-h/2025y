package org.example;

public class reverse {

    public static void main(String[] args) {
        String original = "samsun";  // The original string
        String reversed = "";         // Variable to store the reversed string

        // Loop through the original string from end to start
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed+original.charAt(i);  // Append each character to reversed string
        }

        // Print the reversed string
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
