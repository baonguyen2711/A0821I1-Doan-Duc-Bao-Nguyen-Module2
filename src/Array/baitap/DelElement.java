package Array.baitap;

import java.util.Scanner;

public class DelElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Element in array : ");
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println("\nEnter x : ");
        int x;
        x = input.nextInt();
        System.out.print("Position " + '"' + x + '"' + " is : ");
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                check = true;
                System.out.println(x);
                for (int j = i;j<array.length-1;j++){
                    array[j] = array[j+1];
                }
                break;
            }
        }
        if (!check) {
            System.out.print("Not in array");
        }else {
            System.out.println("Array after delete " + '"' + x + '"' + " : ");
            for (int i = 0;i<array.length-1;i++) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
