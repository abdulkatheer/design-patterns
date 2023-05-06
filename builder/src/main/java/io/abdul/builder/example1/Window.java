package io.abdul.builder.example1;

public class Window {
    String name;
    String material;

    public Window(String material) {
        this.name = "Window made out of " + material;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
    public String toString() {
        return this.name;
    }
}

 
 
