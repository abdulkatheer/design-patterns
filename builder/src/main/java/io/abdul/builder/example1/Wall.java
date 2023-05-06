package io.abdul.builder.example1;

public class Wall {
    String name;
    String material;

    public Wall(String material) {
        this.name = "Wall made out of " + material;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

 
 
