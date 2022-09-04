package Auto;

import java.util.Objects;

public class Auto {

    private String model;
    private String brand;
    private int passengers = 0;
    private String Transmission;

    public Auto(String model, String brand, int passengers, String transmission) {
        this.model = model;
        this.brand = brand;
        this.passengers = passengers;
        this.Transmission = transmission;
    }

    public Auto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return passengers == auto.passengers && model.equals(auto.model) && brand.equals(auto.brand) && Transmission.equals(auto.Transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, passengers, Transmission);
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model=" + model +
                ", brand=" + brand +
                ", passengers=" + passengers +
                ", Transmission=" + Transmission +
                '}';
    }
}
