package accessmodifierandstaticmethods.baitap;

public class CircleAccessModifier {
    private double radius = 1.0;
    private String color = "red";

    public CircleAccessModifier() {

    }

    public CircleAccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void getArea() {

    }
    public String String(){
        return this.color;
    }
}

class TestCircle {
    public static void main(String[] args) {
        CircleAccessModifier circle = new CircleAccessModifier();
        circle.getArea();
        System.out.println("Raddius : " + circle.getRadius() + " ,color is : " + circle.String());
    }
}
