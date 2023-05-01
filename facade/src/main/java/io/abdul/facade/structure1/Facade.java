package io.abdul.facade.structure1;

public class Facade {
    private final Component1 component1;
    private final Component2 component2;
    private final Component3 component3;
    private final Subsystem1 subsystem1;

    public Facade(Component1 component1, Component2 component2, Component3 component3, Subsystem1 subsystem1) {
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
        this.subsystem1 = subsystem1;
    }

    public void process() {

    }
}
