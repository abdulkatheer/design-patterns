package io.abdul.proxy.structure1;

public class Proxy implements Subject {
    private final Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("Proxy takes care of access - Remote or Virtual or Protection");
        System.out.println("Proxy delegated call to the real subject");
        realSubject.request();
    }
}
