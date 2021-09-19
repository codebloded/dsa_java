package string;

import java.lang.Thread.State;

public class duplicats {
    static final int NO_OF_CHARS = 256;

    static void fillcharcount(String str, int[] count) {

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

    }

    static void dupli(String str) {
        int count[] = new int[NO_OF_CHARS];
        fillcharcount(str, count);

        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] > 1)
                System.out.println((char) (i) + ", count = " + count[i]);
    }

    public static void main(String[] args) {
        String str = "test string";
        dupli(str);
    }
}
