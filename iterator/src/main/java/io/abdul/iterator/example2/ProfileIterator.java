package io.abdul.iterator.example2;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}