package javacollection.baitap;

public class ArrayListProduct {
    private String name;
    private int id;
    private int price;
    private static int idTemp;

    public ArrayListProduct() {
    }

    public ArrayListProduct(String name, int price) {
        super();
        this.name = name;
        this.id = ++idTemp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
