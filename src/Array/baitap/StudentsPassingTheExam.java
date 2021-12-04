package Array.baitap;

import java.util.Scanner;

public class StudentsPassingTheExam {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the size : ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j : arr) {
            System.out.print(j + " ");
            if (j >= 5 && j <= 10) {
                count++;
            }
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}


