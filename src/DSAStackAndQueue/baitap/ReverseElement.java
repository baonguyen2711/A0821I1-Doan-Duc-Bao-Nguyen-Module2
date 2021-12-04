package DSAStackAndQueue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void reverseInt(int[] arrayInteger) {
        Stack<Integer> stack = new Stack<>();
        int size = arrayInteger.length;
        for (int i = 0; i < size; i++) {
            stack.push(arrayInteger[i]);
        }
        for (int i = 0; i < size; i++) {
            arrayInteger[i] = stack.pop();
        }
    }

    public static String reverseString(String arrayString) {
        Stack<Character> stack = new Stack<>();
        int size = arrayString.length();
        for (int i = 0; i < size; i++) {
            stack.push(arrayString.charAt(i));
        }
        arrayString = "";
        for (int i = 0; i < size; i++) {
            arrayString = arrayString + stack.pop();
        }
        return arrayString;
    }

    public static void main(String[] args) {
        int[] arrayInteger;
        int size;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for Integer : ");
        size = input.nextInt();
        arrayInteger = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arrayInteger[i] = input.nextInt();
        }

        System.out.print("Mảng số nguyên trước đảo ngược là:\t");
        for (int k : arrayInteger) {
            System.out.print(k + "\t");
        }
        reverseInt(arrayInteger);
        System.out.print("\nMảng số nguyên sau đảo ngược là:\t");
        for (int j : arrayInteger) {
            System.out.print(j + "\t");
        }
        input.nextLine();
        System.out.print("\nEnter any String : ");
        String str = input.nextLine();
        System.out.println("Chuỗi trước đảo ngược là: " + str);
        str = reverseString(str);
        System.out.println("Chuỗi sau đảo ngược là: " + str);
    }
}



