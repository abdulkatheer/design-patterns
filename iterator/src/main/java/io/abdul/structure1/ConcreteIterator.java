package io.abdul.structure1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> items;

    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.size() > position;
    }

    @Override
    public T next() {
        T t = items.get(position);
        position++;
        return t;
    }
}
