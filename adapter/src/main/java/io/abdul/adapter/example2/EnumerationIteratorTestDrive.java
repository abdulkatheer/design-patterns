package io.abdul.adapter.example2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList("1", "2", "three", "4"));
        Iterator<?> iterator = new EnumerationIterator(v.elements());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}