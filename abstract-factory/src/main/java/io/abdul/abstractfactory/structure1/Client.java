package io.abdul.abstractfactory.structure1;

public class Client {
    public static void main(String[] args) {
        ProductFactory a1productFactory = new A1QualityProductFactory();
        System.out.println("*** A1 Quality Products ***");
        System.out.println(a1productFactory.createProductA());
        System.out.println(a1productFactory.createProductB());

        ProductFactory economyProductFactory = new EconomyProductFactory();
        System.out.println("*** Economy Quality Products ***");
        System.out.println(economyProductFactory.createProductA());
        System.out.println(economyProductFactory.createProductB());

    }
}
