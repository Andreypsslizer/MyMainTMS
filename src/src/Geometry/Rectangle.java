package Geometry;

public class Rectangle extends Figure{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
