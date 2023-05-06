package io.abdul.builder.example1;

public class ClayHouseBuilder extends HouseBuilder {
    int numWalls = 4;
    int numWindows = 4;
    String windowMaterial = "Sugar";
    String wallMaterial = "Clay and sand";
    String roofMaterial = "Twizzlers";

    public ClayHouseBuilder() {
        this.builderName = "Clay House Builder";
        setHouseType(HouseType.CLAY);
    }

    @Override
    public HouseBuilder addWalls() {
        // add exterior walls
        for (int i = 0; i < numWalls; i++) {
            System.out.println("Adding wall made out of " + wallMaterial);
            house.addWall(new Wall(wallMaterial));
        }
        return this;
    }

    @Override
    public HouseBuilder addWindows() {
        for (int i = 0; i < numWindows; i++) {
            System.out.println("Adding window made out of " + windowMaterial);
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }

    @Override
    public HouseBuilder addRoof() {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }

    @Override
    public House build() {
        System.out.println("Stick everything together with clay");
        return house;
    }
}
