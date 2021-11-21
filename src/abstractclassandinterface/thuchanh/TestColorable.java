package abstractclassandinterface.thuchanh;

import inheritance.thuchanh.Circle;
import inheritance.thuchanh.Rectangle;
import inheritance.thuchanh.Square;
import inheritance.thuchanh.TheShapes;

public class TestColorable {
    public static void main(String[] args) {
        TheShapes[] shapes = new TheShapes[10];

        for (int i = 0; i < 10; i++) {
            shapes[i] = getRandomShape();
        }
        for (TheShapes k : shapes) {
            System.out.println(k.getArea());
            if (k instanceof Colorable) {
                ((Colorable) k).howToColor();
            }
        }
    }

    static TheShapes getRandomShape() {
        int random = (int) (Math.round(Math.random()));
        int x = (int) Math.floor(Math.random() * 10);
        switch (random) {
            case 0:
                return new Square(x);
            case 1:
                return new Rectangle(x, x);
            default:
                return new Circle(x);
        }
    }
}


