package assignment0913;

public class Circle {

    static final double PI = 3.14159265358979;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {

    }

    public double getArea() {
        return radius * radius * PI;
    }
}
