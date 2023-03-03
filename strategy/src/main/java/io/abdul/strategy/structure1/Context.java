package io.abdul.strategy.structure1;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void runBusinessLogic() {
        strategy.execute();
    }
}
