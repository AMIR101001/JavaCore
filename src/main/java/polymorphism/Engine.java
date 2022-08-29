package polymorphism;

public class Engine {
    private int speed = 0;
    private int power = 0;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return  " speed = " + speed +
                " power = " + power ;
    }
}
