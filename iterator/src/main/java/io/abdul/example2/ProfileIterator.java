package io.abdul.example2;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}