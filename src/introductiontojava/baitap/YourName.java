package introductiontojava.baitap;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello : " + name);
    }
}
