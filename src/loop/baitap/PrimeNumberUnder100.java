package loop.baitap;


public class PrimeNumberUnder100 {
    public static void main(String[] args) {
        boolean check = true;
        int num = 2;
        System.out.println("100 số nguyên tố đầu tiên là:");
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(num + " ");
            }
            check = true;
            num++;
        }
    }
}




