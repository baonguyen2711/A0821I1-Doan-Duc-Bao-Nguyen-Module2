package Inheritance.thuchanh;
import AbstractClassAndInterface.baitap.Resizeable;

public  class TheShapes implements Resizeable {
    private String color = "green";
    private boolean filled = true;

    public TheShapes() {

    }

    public TheShapes(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getArea() {
        return null;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and" + (isFilled() ? " filled" : " not filled");
    }

    public static void printTheShape(TheShapes[] shape) {
        for (TheShapes x : shape) {
            System.out.println(x.getArea());
        }
    }

    @Override
    public void resize(double percent) {

    }
}

class TestTheShapes {
    public static void main(String[] args) {
        TheShapes shapes = new TheShapes();
        System.out.println(shapes);
        shapes = new TheShapes("red", false);
        System.out.println(shapes);
    }
}

