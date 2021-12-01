package javacollection.baitap;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        productManager.add();
        productManager.add();
        productManager.add();
        productManager.sortPrice();
        productManager.display();
        productManager.delete(1);
        productManager.sortPrice();
        productManager.display();
        productManager.edit(2);
        productManager.display();
        productManager.searchName("c");
    }
}
