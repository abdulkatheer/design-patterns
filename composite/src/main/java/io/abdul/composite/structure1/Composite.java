package io.abdul.composite.structure1;

import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> components;

    public Composite(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }

    @Override
    public void operation() {
        System.out.println(name + " - Composite delegating to leaves..");
        for (Component component : components) {
            component.operation();
        }
    }

    @Override
    public void add(Component e) {
        components.add(e);
    }

    @Override
    public void remove(Component e) {
        components.remove(e);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }
}
