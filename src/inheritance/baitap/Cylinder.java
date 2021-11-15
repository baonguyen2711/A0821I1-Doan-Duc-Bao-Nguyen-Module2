package inheritance.baitap;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                '}'+ ", which is a subclass of " + super.toString();
    }
}
class TestCylider{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0,1.0,"yellow");
        System.out.println(cylinder);
    }
}
