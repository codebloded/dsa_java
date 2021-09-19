package string;

import java.io.*;

public class isomorphic {
    static final int CHAR = 256;

    static boolean isoMorphic(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        // Length of both strings must be
        // same for one to one
        // correspondence
        if (n != m)
            return false;

        // For counting the previous appearances
        // of character in both the strings
        int[] countChars1 = new int[CHAR];
        int[] countChars2 = new int[CHAR];

        // Process all characters one by one
        for (int i = 0; i < n; i++) {
            countChars1[str1.charAt(i)]++;
            countChars2[str2.charAt(i)]++;

            // For string to be isomorphic the
            // previous counts of appearances of
            // current character in both string
            // must be same if it is not same we
            // return false.
            if (countChars1[str1.charAt(i)] != countChars2[str2.charAt(i)]) {
                return false;
            }
        }
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println(isoMorphic("aab", "xxy") ? 1 : 0);
        System.out.println(isoMorphic("aab", "xyz") ? 1 : 0);
    }
}
