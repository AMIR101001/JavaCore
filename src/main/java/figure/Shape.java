package figure;

public class Shape {
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double d = 0;

    public Shape() {
    }

    public Shape(double a) {
        this.a = a;
    }

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
}
