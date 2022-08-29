package polymorphism;

public abstract class Car {
    private Engine engineThisCar = null;
    private int seats = 0;
    private String model = " ";
    private  String brand = " ";

    public Car() {
    }

    public Car(Engine engineThisCar, int seats, String model, String brand) {
        this.engineThisCar = engineThisCar;
        this.seats = seats;
        this.model = model;
        this.brand = brand;
    }

    public String getEngineType(){
//        String engineType ="Мощность - " + engineThisCar.getPower() + " Скорость - " + engineThisCar.getSpeed();
//        return engineType;
        return brand + " " + model + " - " + engineThisCar.toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", model='" + model + '\'' +
                ", Brand='" + brand + '\'' +
                '}';
    }

    public int getSeats() {
        return seats;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
