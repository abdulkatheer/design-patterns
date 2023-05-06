package io.abdul.builder.example3;

public class Tent extends Accommodation {
    int siteNumber;

    public Tent() {
        this.name = "Tent";
    }

    public Tent(String name) {
        this.name = name;
    }

    public int getSiteNumber() {
        return this.siteNumber;
    }

    public void setSiteNumber(int n) {
        this.siteNumber = n;
    }

    @Override
    public String getLocation() {
        if (siteNumber == 0) return "";
        else return "Site number " + this.siteNumber;
    }
}