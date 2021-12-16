package JavaCollection.baitap;


import java.util.Scanner;

public class MainTest {
    public static void main(String[] args){

        int choice;
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        productManager.readFile();
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
                    productManager.add();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.searchName();
                    break;
                case 5:
                    productManager.display();
                    break;
                case 6:
                    System.exit(6);
            }

        }
    }
}
