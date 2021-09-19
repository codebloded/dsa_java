package searchingSorting;

public class arthmeticnumber {
    static boolean isMember(int a, int d, int x) {

        // If difference is 0, then x must
        // be same as a.
        if (d == 0)
            return (x == a);

        // Else difference between x and a
        // must be divisible by d.
        return ((x - a) % d == 0 && (x - a) / d >= 0);
    }

    // Driver code.
    public static void main(String args[]) {
        int a = 1, x = 7, d = 3;
        if (isMember(a, d, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
