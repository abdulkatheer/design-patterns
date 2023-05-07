package io.abdul.chain.of.responsibility.structure1;

public interface Handler {
    void setNext(Handler successor);

    void handle(Request request);
}
