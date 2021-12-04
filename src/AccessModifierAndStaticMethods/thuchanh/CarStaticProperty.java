package AccessModifierAndStaticMethods.thuchanh;

public class CarStaticProperty {
    private final String name;
    private final String engine;
    public static int numberOfCars;


    public CarStaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    void display(){
        System.out.println(name + " " + engine + " ! ");
    }
}
class  TestStaticProperty{
    public static void main(String[] args) {
        CarStaticProperty car1 = new CarStaticProperty("Mazda 3","Skyactiv 3");
        System.out.print(CarStaticProperty.numberOfCars + " : ");
        car1.display();
        CarStaticProperty car2 = new CarStaticProperty("Mazda 6","Skyactiv 6");
        System.out.print(CarStaticProperty.numberOfCars + " : ");
        car2.display();
        CarStaticProperty car3 = new CarStaticProperty("Honda 6","Skyactiv 6");
        System.out.print(CarStaticProperty.numberOfCars + " : ");
        car3.display();
    }
}
