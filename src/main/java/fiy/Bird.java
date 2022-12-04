package fiy;

public class Bird implements Flyable{
    Flight flight;
    BirdFood birdFood = new BirdFood();

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
        birdFood.information();
    }
}
