package fiy;

public class Flight {
    private int height = 0;
    private int speed = 0;

    public Flight(int height, int speeg) {
        this.height = height;
        this.speed = speeg;
    }

    public String status (){
        return "height = " + height + ";  speed = " + speed + "; ";
    }
}
