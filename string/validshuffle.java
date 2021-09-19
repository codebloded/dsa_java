package string;

public class validshuffle {
    public static boolean isInterleaving(String X, String Y, String S) {
        // return true if the end of all strings is reached
        if (X.length() == 0 && Y.length() == 0 && S.length() == 0) {
            return true;
        }

        // return false if the end of string `S` is reached,
        // but string `X` or `Y` is not empty

        if (S.length() == 0) {
            return false;
        }

        // if string `X` is not empty and its first character matches with the
        // first character of `S`, recur for the remaining substring

        if (X.length() != 0 && S.charAt(0) == X.charAt(0)) {
            return isInterleaving(X.substring(1), Y, S.substring(1));
        }

        // if string `Y` is not empty and its first character matches with the
        // first character of `S`, recur for the remaining substring

        if (Y.length() != 0 && S.charAt(0) == Y.charAt(0)) {
            return isInterleaving(X, Y.substring(1), S.substring(1));
        }

        return false;
    }

    public static void main(String[] args) {
        String X = "ABC";
        String Y = "DEF";
        String S = "ADEBFC";

        if (isInterleaving(X, Y, S)) {
            System.out.print("Given string is an interleaving of X and Y");
        } else {
            System.out.print("Given string is not interleaving of X and Y");
        }
    }
}
