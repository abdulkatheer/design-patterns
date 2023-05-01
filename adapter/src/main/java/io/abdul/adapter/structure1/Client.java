package io.abdul.adapter.structure1;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());

        int result = target.doSomething(100L);

        System.out.println(result);
    }
}
