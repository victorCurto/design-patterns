package CreationalPatterns.builder.example1.builders;

import CreationalPatterns.builder.example1.products.components.Engine;
import CreationalPatterns.builder.example1.products.components.GPSNavigator;
import CreationalPatterns.builder.example1.products.components.Transmission;
import CreationalPatterns.builder.example1.products.components.TripComputer;
import CreationalPatterns.builder.example1.products.CarType;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
