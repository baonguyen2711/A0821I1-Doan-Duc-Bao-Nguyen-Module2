package JavaCollection.baitap;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<ArrayListProduct> listProducts = new ArrayList<>();

    public ProductManager() {
    }

    public void add() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Sản phẩm có giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        ArrayListProduct product = new ArrayListProduct(name, price);
        listProducts.add(product);
        display();
    }

    public void edit() {
        System.out.println("Nhập ID cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (ArrayListProduct listProduct : listProducts) {
            if (listProduct.getId() == id) {
                System.out.print("Đổi tên sản phẩm tại ID số " + id + ": ");
                listProduct.setName(scanner.nextLine());
                System.out.print("Đổi giá sản phẩm tại ID số " + id + ": ");
                listProduct.setPrice(Integer.parseInt(scanner.nextLine()));
            }
        }
        System.out.println("\nDanh sách sản phẩm sau khi đổi thông tin: ");
    }

    public void delete() {
        System.out.println("Nhập ID cần xoá: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\nDanh sách sản phẩm sau khi xoá là: ");
        ArrayListProduct product = new ArrayListProduct();
        for (ArrayListProduct listProduct : listProducts) {
            if (listProduct.getId() == id) {
                product = listProduct;
                break;
            }
        }
        listProducts.remove(product);
        display();
    }

    public void display() {
        System.out.println("------------------------------------------------------------");
        sortPrice();
        for (ArrayListProduct productManager : listProducts) {

            System.out.println("Tên sản phẩm: " + productManager.getName() + " ---"
                    + " Mã sản phẩm(ID): " + productManager.getId() + " ---"
                    + " Giá sản phẩm: " + productManager.getPrice());

        }

    }

    public void sortPrice() {
        listProducts.sort(new SortPrice());
    }

    public void searchName() {
        System.out.println("------------------------------------------------------------");
        boolean check = false;
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        for (ArrayListProduct listProduct : listProducts) {
            if (listProduct.getName().equals(name)) {
                check = true;
                System.out.println("\nThông tin sản phẩm cần tìm là: \n" + "Tên sản phẩm: " + listProduct.getName() + " ---"
                        + " Mã sản phẩm(ID): " + listProduct.getId() + " ---"
                        + " Giá sản phẩm: " + listProduct.getPrice());
                break;
            }

        }
        if (!check) {
            System.out.println("\nKhông tìm thấy tên sản phẩm !!!");
        }
    }
}
