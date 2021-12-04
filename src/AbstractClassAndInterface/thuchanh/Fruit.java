package AbstractClassAndInterface.thuchanh;

public abstract class Fruit implements Edible {

}
class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}

