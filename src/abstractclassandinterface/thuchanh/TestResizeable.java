package abstractclassandinterface.thuchanh;

import inheritance.thuchanh.Circle;
import inheritance.thuchanh.Rectangle;
import inheritance.thuchanh.Square;
import inheritance.thuchanh.TheShapes;

public class TestResizeable {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()* 10);
        TheShapes[] shapes = new TheShapes[3];
        shapes[0] = new Circle(x);
        shapes[1] = new Rectangle(x,x);
        shapes[2] = new Square(x);
        System.out.println("Before : ");
        TheShapes.printTheShape(shapes);
        for (TheShapes k : shapes) {
            k.resize(Math.random()*100);
        }
        System.out.println("\nAfter : ");
        TheShapes.printTheShape(shapes);
    }
}
