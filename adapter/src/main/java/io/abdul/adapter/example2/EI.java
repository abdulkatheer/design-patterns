package io.abdul.adapter.example2;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EI {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList("1", "2", "three", "4"));
        Enumeration<String> enumeration = v.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        for (String s : v) {
            System.out.println(s);
        }
    }
}
