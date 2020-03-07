import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pricelist {
    //private int article;
    //private String name;
    //private double cost;
    //private static TreeMap<> data;
    private static HashMap<Integer, String> pl = new HashMap<Integer, String>();

    //add - добавляет запись по заданным id и продуктам
    private static void add(Integer id, String productAndPrice) {
        pl.put(id, productAndPrice);
    }


    //del - удаляет записи по id
    private static void del(Integer id) {
        pl.remove(id);
    }

    //private static void
}
