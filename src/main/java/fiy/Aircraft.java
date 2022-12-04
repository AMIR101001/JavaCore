package fiy;

public class Aircraft implements Flyable{

    Flight flight;
    Technique technique = new Technique();

    @Override
    public void setFlight(int height, int speed) {
        flight = new Flight(height, speed);
    }

    @Override
    public void isFlying() {
        flight.status();
    }

    @Override
    public void isEating() {
        technique.information();
    }
}
