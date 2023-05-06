package io.abdul.builder.example3;

public abstract class Accommodation {
    String name;
    Reservation reservation = null;

    public Reservation getReservation() {
        return this.reservation;
    }

    public void setReservation(Reservation r) {
        this.reservation = r;
    }

    public abstract String getLocation();

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("You're staying at ")
                .append(name);
        if (this.reservation != null) {
            display.append("\nYou have a reservation for arrival date: ")
                    .append(reservation.getArrivalDate())
                    .append(", staying for ")
                    .append(reservation.getNights())
                    .append(" nights");
        }
        if (this.getLocation() != "") {
            display.append(" in ")
                    .append(this.getLocation());
        }
        display.append("\n");
        return display.toString();
    }
}