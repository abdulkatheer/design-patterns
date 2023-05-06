package io.abdul.builder.example2;

import java.util.List;

public class Pizza {
    String name;
    List<String> toppings;

    void addToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ")
                .append(this.name)
                .append(" ----\n");
        for (String topping : toppings) {
            display.append(topping)
                    .append("\n");
        }
        return display.toString();
    }
}

 
 
