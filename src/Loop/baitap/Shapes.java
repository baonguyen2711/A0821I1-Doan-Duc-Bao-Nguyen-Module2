package Loop.baitap;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Shapes");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle " +
                    "(The corner is square at 4 different angles: " +
                    "top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter the choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("* ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 6; j > i; j--)
                            System.out.print("  ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++)
                            System.out.print("  ");
                        for (int j = 6; j >= i; j--)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 5; j > i; j--)
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println("* ");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
