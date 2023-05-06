package io.abdul.builder.example3;

import java.util.ArrayList;
import java.util.List;

public class Vacation {
    String name;
    List<Accommodation> accommodations = new ArrayList<Accommodation>();
    List<String> events = new ArrayList<String>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAccommodations(List<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(this.name).append(" ----\n");
        for (Accommodation a : accommodations) {
            display.append(a);
        }
        for (String e : events) {
            display.append(e).append("\n");
        }
        return display.toString();
    }
}

 
 
