package AbstractClassAndInterface.thuchanh;

public abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger : grrrrrrr";
    }
}

class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken : cac cac";
    }

    @Override
    public String howToEat() {
        return "Chicken : could be fried";
    }
}






