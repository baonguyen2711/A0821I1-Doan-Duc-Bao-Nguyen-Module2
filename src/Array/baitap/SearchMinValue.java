package Array.baitap;

import java.util.Scanner;

public class SearchMinValue {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size : ");
        size = input.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Element in Array : ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        int min = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.println("\nThe smallest property value in the list is " + min + " ,at position " + index);
    }
}
