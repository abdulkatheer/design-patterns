package io.abdul.composite.structure1;

public interface Component {
    void operation();

    default void add(Component e) {
        throw new UnsupportedOperationException();
    }

    default void remove(Component e) {
        throw new UnsupportedOperationException();
    }

    default Component getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
