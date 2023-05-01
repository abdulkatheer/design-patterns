package io.abdul.adapter.structure1;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int doSomething(Long data) {
        String result = adaptee.process(String.valueOf(data));
        return Integer.parseInt(result);
    }
}
