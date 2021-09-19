package string;

import java.util.*;

public class secondmostrepetetative {
    static String secMostRepeated(Vector<String> seq) {
        // Store all the words with its occurrence
        HashMap<String, Integer> occ = new HashMap<String, Integer>(seq.size()) {
            @Override
            public Integer get(Object key) {
                return containsKey(key) ? super.get(key) : 0;
            }
        };

        for (int i = 0; i < seq.size(); i++)
            occ.put(seq.get(i), occ.get(seq.get(i)) + 1);

        // find the second largest occurrence
        int first_max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;

        Iterator<Map.Entry<String, Integer>> itr = occ.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            int v = entry.getValue();
            if (v > first_max) {
                sec_max = first_max;
                first_max = v;
            }

            else if (v > sec_max && v != first_max)
                sec_max = v;
        }

        // Return string with occurrence equals
        // to sec_max
        itr = occ.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            int v = entry.getValue();
            if (v == sec_max)
                return entry.getKey();
        }

        return null;
    }

    // Driver method
    public static void main(String[] args) {
        String arr[] = { "ccc", "aaa", "ccc", "ddd", "aaa", "aaa" };
        List<String> seq = Arrays.asList(arr);

        System.out.println(secMostRepeated(new Vector<>(seq)));
    }
}
