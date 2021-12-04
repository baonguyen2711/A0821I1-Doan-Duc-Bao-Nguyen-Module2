package Array.baitap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int size;
        int [] arr;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        size = input.nextInt();
        arr = new int[size+1];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Element in array : ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println("\nEnter the X : ");
        int x = input.nextInt();
        System.out.println("Enter index add X :");
        int index = input.nextInt() - 1;
        if (index < 0 || index > size) {
            System.out.println("Index is invalid !!!");
        } else {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
        }
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

