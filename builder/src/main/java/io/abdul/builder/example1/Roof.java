package io.abdul.builder.example1;

public class Roof {
    String name;
    String material;

    public Roof(String material) {
        this.name = "Roof made out of " + material;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
    public String toString() {
        return this.name;
    }
}
