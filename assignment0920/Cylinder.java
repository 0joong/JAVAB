package assignment0920;

public class Cylinder extends Circle{

    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getArea() {
        return (2*PI*radius*radius) + (2*PI*radius*height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
