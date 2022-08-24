package Auto;

public class Auto {

    private String model;
    private String brand;
    private int passengers = 0;
    private String Transmission;

    public Auto(String marc, String model, int passengers, String transmission) {
        this.model = model;
        this.brand = brand;
        this.passengers = passengers;
        Transmission = transmission;
    }

    public Auto() {
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
