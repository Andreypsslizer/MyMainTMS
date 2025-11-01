package Geometry;

public class Triangle extends Figure implements Cloneable{
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter();
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
