package demo;

import java.util.Comparator;

public abstract class demoProduct {
    private int id;
    private String name;
    private String manufacturer;
    private int price;
    private static int idTemp;
    private String warranty_period;
    private String nation;
    private String status;

    public demoProduct() {
    }

    public demoProduct(int id, String name, String manufacturer, int price) {
        this.id = ++idTemp;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id +
                "," + name  +
                "," + manufacturer +
                "," + price;
    }

    public void setWarranty_period(String nextLine) {
    }

    public void setNation(String nextLine) {
    }

    public void setStatus(String nextLine) {
    }

    public static class SortPrice implements Comparator<demoProduct> {
        @Override
        public int compare(demoProduct o1, demoProduct o2) {
            if (o1.getPrice() > o2.getPrice()) return 1;
            else if (o1.getPrice() < o2.getPrice()) return -1;
            else return 0;
        }
    }
}
