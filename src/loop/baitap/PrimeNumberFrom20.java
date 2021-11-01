package loop.baitap;

import java.util.Scanner;

public class PrimeNumberFrom20 {
    public static void main(String[] args) {
        int n;
        boolean check = true;
        int num = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nguyên tố : ");
        n = scanner.nextInt();
        if (n >= 1) {
            System.out.println(n + " Số nguyên tố đầu tiên là:");
        }
        for (int i = 1; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(num + " ");
                i++;
            }
            check = true;
            num++;
        }
    }
}
