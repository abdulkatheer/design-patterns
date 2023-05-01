package io.abdul.template.method.structure1;

public abstract class Algorithm {
    final void runAlgorithm() {
        step1();
        hook1();
        step2();
        hook2();
        step3();
        step4();
        hook3();
    }

    void step1() {
        System.out.println("Parent - Step 1");
    }

    abstract void step2();

    void step3() {
        System.out.println("Parent - Step 3");
    }

    abstract void step4();

    void hook1() {
        System.out.println("Parent - hook 1");
    }

    void hook2() {
        System.out.println("Parent - hook 2");
    }

    void hook3() {
        System.out.println("Parent - hook 3");
    }
}
