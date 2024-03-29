package io.abdul.builder.example4;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    Builder setCarType(CarType type);

    Builder setSeats(int seats);

    Builder setEngine(Engine engine);

    Builder setTransmission(Transmission transmission);

    Builder setTripComputer(TripComputer tripComputer);

    Builder setGPSNavigator(GPSNavigator gpsNavigator);

    Car build();
}