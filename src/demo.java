import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

class CountString {
    public static void main(String[] args) {
        String string = new String("Hello World").toLowerCase();
        String[] array = string.split("");
        int count = 0;
        Map<String, Integer> stringTreeMap = new TreeMap();
//        for (int i = 0; i < array.length; i++) {
//            stringTreeMap.put(array[i], 0);
//        }

        for (int i = 0; i < array.length; i++) {
            boolean flag = stringTreeMap.containsKey(array[i]);
            if (flag) {
                count = stringTreeMap.get(array[i]);
                count++;
                stringTreeMap.put(array[i], count);
            } else {
                stringTreeMap.put(array[i], 1);
            }
        }
        System.out.println(stringTreeMap);
    }
}