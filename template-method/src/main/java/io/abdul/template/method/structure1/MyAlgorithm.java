package io.abdul.template.method.structure1;

public class MyAlgorithm extends Algorithm {
    @Override
    void step2() {
        System.out.println("Subclass - Step 2");
    }

    @Override
    void step4() {
        System.out.println("Subclass - Step 4");
    }

    @Override
    void hook1() {
        System.out.println("Subclass - hook 1");
    }

    @Override
    void hook3() {
        System.out.println("Subclass - hook 3");
    }
}
