package io.abdul.decorator.structure1;

public abstract class Decorator implements Component {
    protected final Component component;

    protected Decorator(Component component) {
        this.component = component;
    }
}
