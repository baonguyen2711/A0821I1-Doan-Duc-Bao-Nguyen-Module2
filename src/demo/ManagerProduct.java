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
            System.out.print("Add Handle product or Authentic product (H/A):");
            choice = scanner.nextLine();
            choice = choice.toUpperCase();
            if (!choice.equals("H") && !choice.equals("A")) System.out.println("Input invalid. Re-enter your input.");
        } while (!choice.equals("H") && !choice.equals("A"));

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
        System.out.println("Input ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean isHanded = false;
        boolean checkID = false;
        for (demoProduct demoProduct : listProducts) {
            if ((demoProduct instanceof HandedProduct)) {
                isHanded = true;
            }
            if (demoProduct.getId() == id) {
                checkID = true;
                System.out.print("Input name product: ");
                demoProduct.setName(scanner.nextLine());
                System.out.print("Input manufacturer: ");
                demoProduct.setManufacturer(scanner.nextLine());
                System.out.print("Input price: ");
                demoProduct.setPrice(Integer.parseInt(scanner.nextLine()));

                if (isHanded) {
                    System.out.print("Input warranty period: ");
                    demoProduct.setWarranty_period(scanner.nextLine());

                }
                if (!isHanded) {
                    System.out.print("Input nation: ");
                    demoProduct.setNation(scanner.nextLine());
                    System.out.print("Input status: ");
                    demoProduct.setStatus(scanner.nextLine());
                }
                writeFile();
                //readAndWrite.writeFile(listProducts);
            }

        }
        if (!checkID) {
            System.out.println("Not found ID");
        }
        System.out.println("\nList of products after changing information: ");
        display();
    }


    public void delete() {
        System.out.println("Input ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Are you sure to delete (Y/N): ");
        String answer = scanner.nextLine();
        boolean checkID = false;
        System.out.println("\nThe list of products after deletion is: ");
        for (demoProduct product : listProducts) {
            if (answer.equalsIgnoreCase("Y")) {
                if (product.getId() == id) {

                    listProducts.remove(product);
                    checkID = true;
                }
                if (!checkID) {
                    System.out.println("Not found ID");
                }
            }
        }
        //readAndWrite.writeFile(listProducts);
        writeFile();
        display();
    }

    //
    public void display() {
        System.out.println("------------------------------------------------------------");
        sortPrice();
        for (demoProduct demoProduct : listProducts) {
            if (demoProduct instanceof HandedProduct) {
                System.out.println("ID: " + demoProduct.getId() + " , " + "Name: " + demoProduct.getName() + " , " +
                        "Manufacturer: " + demoProduct.getManufacturer()
                        + " , " + "Price: " + demoProduct.getPrice() + " , "
                        + "Warranty_period: " + demoProduct.getWarranty_period());
            } else {
                System.out.println("ID: " + demoProduct.getId() + " , " + "Name: " + demoProduct.getName() + " , " +
                        "Manufacturer: " + demoProduct.getManufacturer()
                        + " , " + "Price: " + demoProduct.getPrice() + " , " + "Nation: " + demoProduct.getNation()
                        + " , " + "Status: " + demoProduct.getStatus());
            }
        }
    }


    public void sortPrice() {
        listProducts.sort(new demoProduct.SortPrice());
        //readAndWrite.writeFile(listProducts);
        writeFile();
    }

    public void searchName() {
        System.out.println("------------------------------------------------------------");
        boolean check = false;
        System.out.println("Input products to find: ");
        String name = scanner.nextLine();
        for (demoProduct demoProduct : listProducts) {
            if (demoProduct.getName().equals(name)) {
                check = true;
                System.out.println("\nProduct information is: \n" + "Name: " + demoProduct.getName() + " ---"
                        + " ID: " + demoProduct.getId() + " ---"
                        + " Product price: " + demoProduct.getPrice());
                writeFile();
                break;
            }

        }
        if (!check) {
            System.out.println("\nNot found name !!!");
        }

    }

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
            System.err.println("The file does not exist or the content has an error");
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

