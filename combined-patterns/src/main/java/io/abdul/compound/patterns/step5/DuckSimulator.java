package io.abdul.compound.patterns.step5;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();

        simulator.simulate(abstractDuckFactory);
    }

    void simulate(AbstractDuckFactory abstractDuckFactory) {
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable decoyDuck = abstractDuckFactory.createDecoyDuck();
        Quackable gooseDuck = abstractDuckFactory.createGooseDuck();

        Flock flockOfDucks = new Flock();
        flockOfDucks.addQuackable(mallardDuck);
        flockOfDucks.addQuackable(redheadDuck);
        flockOfDucks.addQuackable(duckCall);
        flockOfDucks.addQuackable(rubberDuck);
        flockOfDucks.addQuackable(decoyDuck);
        flockOfDucks.addQuackable(gooseDuck);

        System.out.println("\nDuck Simulator: With Goose Adapter");

        Observer observer = new Quackologist();
//        mallardDuck.registerObserver(observer);
//        redheadDuck.registerObserver(observer);
//        duckCall.registerObserver(observer);
//        rubberDuck.registerObserver(observer);
//        decoyDuck.registerObserver(observer);
//        gooseDuck.registerObserver(observer);
        flockOfDucks.registerObserver(observer);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(decoyDuck);
//        simulate(gooseDuck);
        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " number of times...!");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
