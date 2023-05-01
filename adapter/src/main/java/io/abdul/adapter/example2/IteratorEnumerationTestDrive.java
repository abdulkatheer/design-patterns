package io.abdul.adapter.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("1", "2", "three", "4"));

        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
