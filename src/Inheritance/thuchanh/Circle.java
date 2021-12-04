package Inheritance.thuchanh;


public class Circle extends TheShapes {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getArea() {
        return "Area circle = " + radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius=" + getRadius() + " and area=" + getArea() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        radius = radius + radius * (percent / 100);
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("Yellow", true, 5.0);
        System.out.println(circle);
    }
}
