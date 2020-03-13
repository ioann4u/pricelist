import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Pricelist {
    private static HashMap<Id, Data> priceCurrent = new HashMap<Id, Data>();

    //add - добавляет запись по заданным id и продуктам
    private static void add(Id identify, Data data) {
        priceCurrent.put(identify, data);
    }

    //del - удаляет записи по id
    private static void del(Id identify) {
        priceCurrent.remove(identify);
    }


    public static void change(Id identify, Data newData) {
        priceCurrent.replace(identify, newData);
    }


    public static String find(Id identify) {
        Data result = priceCurrent.get(identify);
        if (result == null) return "Такого продукта нет";
        return result.toString();
    }

    public Map<Id, Data> getPriceList() {
        return priceCurrent;
    }

    @Override
    public String toString() {
        return priceCurrent.toString();
    }

    @Override
    public boolean equals(Object full) {
        if (full == this) {
            return true;
        }
        if (full == null || full.getClass() != this.getClass()) {
            return false;
        }
        Pricelist another = (Pricelist) full;
        return priceCurrent.hashCode() == another.getPriceList().hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceCurrent);
    }
}
