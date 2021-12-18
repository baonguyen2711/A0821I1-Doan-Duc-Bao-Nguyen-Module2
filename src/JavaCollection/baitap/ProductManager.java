package JavaCollection.baitap;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    //ReadAndWrite readAndWrite =new ReadAndWrite();
    Scanner scanner = new Scanner(System.in);
    List<ArrayListProduct> listProducts = new ArrayList<>();

    public ProductManager() {
        //readAndWrite.readFile();
    }

    public void add() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Sản phẩm có giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        ArrayListProduct product = new ArrayListProduct(name, price);
        listProducts.add(product);
        //readAndWrite.writeFile(listProducts);
        System.out.println("Thêm mới thành công");
        display();
        writeFile();
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
                //readAndWrite.writeFile(listProducts);
                writeFile();
            }
        }
        System.out.println("\nDanh sách sản phẩm sau khi đổi thông tin: ");
        display();
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
        //readAndWrite.writeFile(listProducts);
        writeFile();
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
        //readAndWrite.writeFile(listProducts);
        writeFile();
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

    private static final String PRODUCT_FILE = "src/JavaCollection/baitap/product";
    private static final List<String> products = new ArrayList<String>();

    public  void readFile() {
        try {
            File file = new File(PRODUCT_FILE);
            String line = "";
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                products.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi");
        }
    }

    public void writeFile() {
        try {
            FileWriter writer = new FileWriter(PRODUCT_FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (ArrayListProduct product : listProducts) {
                bufferedWriter.write(product.toString());
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
