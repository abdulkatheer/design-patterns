package io.abdul.structure1;

import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private final List<T> items;

    public ConcreteAggregate(List<T> items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
