package io.abdul.composite.structure1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");
        Component leaf4 = new Leaf("leaf4");
        Component leaf5 = new Leaf("leaf5");
        Component leaf6 = new Leaf("leaf6");

        Component composite1 = new Composite("composite1", new ArrayList<>());
        composite1.add(leaf1);
        composite1.add(leaf2);
        Component composite2 = new Composite("composite2", new ArrayList<>());
        composite2.add(leaf3);
        composite2.add(leaf4);
        Component rootComposite = new Composite("rootComposite", new ArrayList<>());
        rootComposite.add(composite1);
        rootComposite.add(composite2);
        rootComposite.add(leaf5);
        rootComposite.add(leaf6);

        rootComposite.operation();
    }
}
