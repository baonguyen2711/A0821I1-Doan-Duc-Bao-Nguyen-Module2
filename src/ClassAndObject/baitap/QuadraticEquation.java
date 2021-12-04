package ClassAndObject.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(this.getDiscriminant())) / (2 * a));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has two roots: ");
            System.out.println("Delta is: " + quadraticEquation.getDiscriminant());
            System.out.println("Root1 is: " + quadraticEquation.getRoot1());
            System.out.println("Root2 is: " + quadraticEquation.getRoot2());
        }
    }
}
