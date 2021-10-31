package introductiontojava.baitap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sô tiền USD : ");
        USD = scanner.nextDouble();
        double quydoi = USD * VND;
        System.out.println("Giá trị VND : " + quydoi);
    }
}
