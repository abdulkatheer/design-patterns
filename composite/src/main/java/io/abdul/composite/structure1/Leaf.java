package io.abdul.composite.structure1;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + " - Do something..!");
    }
}
