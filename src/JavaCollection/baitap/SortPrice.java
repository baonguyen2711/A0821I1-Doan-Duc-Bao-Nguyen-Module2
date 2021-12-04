package JavaCollection.baitap;

import java.util.Comparator;

public class SortPrice implements Comparator<ArrayListProduct> {
    @Override
    public int compare(ArrayListProduct o1, ArrayListProduct o2) {
        if (o1.getPrice() > o2.getPrice()) return 1;
        else if (o1.getPrice() < o2.getPrice()) return -1;
        else return 0;
    }
}
