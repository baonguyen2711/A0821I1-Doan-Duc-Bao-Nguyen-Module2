package demo;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    Scanner scanner = new Scanner(System.in);
    List<demoProduct> listProducts = new ArrayList<>();

    public ManagerProduct() {
        //readAndWrite.readFile();
    }

    public void add() {
        String choice;
        do {
            System.out.print("Add Handle product or Genuine product (H/G):");
            choice = scanner.nextLine();
            choice = choice.toUpperCase();
            if (!choice.equals("H") && !choice.equals("G")) System.out.println("Input invalid. Re-enter your input.");
        } while (!choice.equals("H") && !choice.equals("G"));

        demoProduct demoProduct;
        System.out.print("Input name product: ");
        String name = scanner.nextLine();
        System.out.print("Input manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        if (choice.equals("H")) {
            System.out.print("Input warranty period: ");
            String warranty_period = scanner.nextLine();
            demoProduct = new HandedProduct(0, name, manufacturer, price, warranty_period);
        } else {
            System.out.print("Input nation: ");
            String nation = scanner.nextLine();
            System.out.print("Input status: ");
            String status = scanner.nextLine();
            demoProduct = new AuthenticProduct(0, name, manufacturer, price, nation, status);
        }
        listProducts.add(demoProduct);
        writeFile();
        System.out.println("Add new product Successfull !!!");
    }

    public void edit() {
        System.out.println("Nhập ID cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean isHanded = false;


        for (demoProduct demoProduct : listProducts) {
            if ((demoProduct instanceof HandedProduct)) {
                isHanded = true;
            }
            if (demoProduct.getId() == id) {
                System.out.print("Input name product: ");
                demoProduct.setName(scanner.nextLine());
                System.out.print("Input manufacturer: ");
                demoProduct.setManufacturer(scanner.nextLine());
                System.out.print("Input price: ");
                demoProduct.setPrice(Integer.parseInt(scanner.nextLine()));

                if (isHanded) {
                    System.out.print("Input warranty period: ");
                    demoProduct.setWarranty_period(scanner.nextLine());
                } else {
                    System.out.print("Input nation: ");
                    demoProduct.setNation(scanner.nextLine());
                    System.out.print("Input status: ");
                    demoProduct.setStatus(scanner.nextLine());
                }
                writeFile();

                //readAndWrite.writeFile(listProducts);
            }
        }
        if (!isHanded) {
            System.out.println("Không tim thấy ID");
        }
        System.out.println("\nDanh sách sản phẩm sau khi đổi thông tin: ");
        display();
    }

    //
//    public void delete() {
//        System.out.println("Nhập ID cần xoá: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("\nDanh sách sản phẩm sau khi xoá là: ");
//        ArrayListProduct product = new ArrayListProduct();
//        for (ArrayListProduct listProduct : listProducts) {
//            if (listProduct.getId() == id) {
//                product = listProduct;
//                break;
//            }
//        }
//        listProducts.remove(product);
//        //readAndWrite.writeFile(listProducts);
//        writeFile();
//        display();
//    }
//
    public void display() {
        System.out.println("------------------------------------------------------------");
        sortPrice();
        for (demoProduct productManager : listProducts) {
            System.out.println("Tên sản phẩm: " + productManager.getName() + " ---"
                    + " Mã sản phẩm(ID): " + productManager.getId() + " ---"
                    + " Giá sản phẩm: " + productManager.getPrice());

        }

    }

    public void sortPrice() {
        listProducts.sort(new demoProduct.SortPrice());
        //readAndWrite.writeFile(listProducts);
        writeFile();
    }

    //    public void searchName() {
//        System.out.println("------------------------------------------------------------");
//        boolean check = false;
//        System.out.println("Nhập tên sản phẩm cần tìm: ");
//        String name = scanner.nextLine();
//        for (ArrayListProduct listProduct : listProducts) {
//            if (listProduct.getName().equals(name)) {
//                check = true;
//                System.out.println("\nThông tin sản phẩm cần tìm là: \n" + "Tên sản phẩm: " + listProduct.getName() + " ---"
//                        + " Mã sản phẩm(ID): " + listProduct.getId() + " ---"
//                        + " Giá sản phẩm: " + listProduct.getPrice());
//                break;
//            }
//
//        }
//        if (!check) {
//            System.out.println("\nKhông tìm thấy tên sản phẩm !!!");
//        }
//    }
//
    private static final String PRODUCT_FILE = "src/demo/result";
    private static final List<String> products = new ArrayList<String>();

    public void readFile() {
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
            for (demoProduct demoProduct : listProducts) {
                bufferedWriter.write(String.valueOf(demoProduct));
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

