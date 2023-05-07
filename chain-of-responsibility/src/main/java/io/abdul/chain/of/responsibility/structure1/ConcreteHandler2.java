package io.abdul.chain.of.responsibility.structure1;

public class ConcreteHandler2 extends BaseHandler {
    @Override
    public void handle(Request request) {
        System.out.println("ConcreteHandler2 Checking and handling request..");
        System.out.println("ConcreteHandler2 Passing to next handler in the chain");
        successor.handle(request);
    }
}
