package io.abdul.iterator.structure1;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
