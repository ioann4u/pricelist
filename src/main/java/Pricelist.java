import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Pricelist {
    private HashMap<Id, Data> priceCurrent = new HashMap<Id, Data>();

    //add - добавляет запись по заданным id и продуктам
    public void add(Id identify, Data data) {
        priceCurrent.put(identify, data);
    }

    //del - удаляет записи по id
    public void del(Id identify) {
        priceCurrent.remove(identify);
    }

    public void changePrice(Id identify, Data newData) {
        priceCurrent.replace(identify, newData);
    }

    public void changeName(Id newIdentify, Data data) { priceCurrent.replace(newIdentify, data); }

/**    public void sum(Data rubles, Data penny) {

    }
*/
    /**
     * В задании вроде не нужно искать товар.
    public String find(Id identify) {
        Data result = priceCurrent.get(identify);
        if (result == null) return "Такого продукта нет";
        return result.toString();
    }
     */

    public Map<Id, Data> getPriceList() {
        return priceCurrent;
    }



    //toString пока не готов.
    @Override
    public String toString() {
        /** StringBuilder priceCurrentStr = new StringBuilder();
        priceCurrentStr.append(new Pricelist());
        */
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
