import java.util.*;


public class Pricelist {
    private static HashMap<Id, Data> priceCurrent = new HashMap<Id, Data>();

    //add - добавляет запись по заданным id и продуктам
    void add(Id identify, Data data) {

        priceCurrent.put(identify, data);
        //if (priceCurrent.isEmpty()) {
//            throw new IllegalArgumentException("price current can't be empty");
        //}
    }

    //del - удаляет записи по id
    void del(Id identify) {
        priceCurrent.remove(identify);
    }

    void changePrice(Id identify, Data newData) {
        priceCurrent.replace(identify, newData);
    }

    //void changeName(Id oldName, Id newName) {
      //  priceCurrent.replace(oldName, newName);
    //}
/**
    public double sum(Map<Id, Integer> receipt) {

        double finalPrice = 0.0;
        for (Map.Entry<Id, Integer> res : receipt.entrySet()) {
            finalPrice += priceCurrent.get();
        }
        return finalPrice;
    }
*/
    public Map<Id, Data> getPriceList() {
        return priceCurrent;
    }



    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Id, Data> res : priceCurrent.entrySet()) {
            result.append(res.getKey()).append(res.getValue());
        }

        return result.toString();
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
        return Objects.equals(priceCurrent, another.priceCurrent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceCurrent);
    }
}
