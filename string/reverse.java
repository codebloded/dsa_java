package string;

import java.lang.*;
import java.io.*;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        String input = "Geeks for Geeks";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
}
