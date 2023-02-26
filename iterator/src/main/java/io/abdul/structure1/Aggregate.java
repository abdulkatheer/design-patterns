package io.abdul.structure1;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
