package demo;

import JavaCollection.baitap.ProductManager;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args){
        ManagerProduct managerProduct = new ManagerProduct();
        managerProduct.readFile();
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----DANH SÁCH----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Hiển thị sản phẩm");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn chọn theo số: ");
            choice=scanner.nextInt();
            switch (choice) {
                case 1 :
                    managerProduct.add();
                    break;
                case 2:
                    managerProduct.edit();
                    break;

                case 3:
                    managerProduct.delete();
                    break;
                case 4:
                    managerProduct.searchName();
                    break;
                case 5:
                    managerProduct.display();
                    break;
                case 6:
                    System.exit(6);
            }

        }
    }
}
