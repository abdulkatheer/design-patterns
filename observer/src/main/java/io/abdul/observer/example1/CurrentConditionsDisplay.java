package io.abdul.observer.example1;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + weatherData.getTemperature()
                + "F degrees and " + weatherData.getHumidity() + "% humidity");
    }
}