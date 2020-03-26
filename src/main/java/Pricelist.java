import java.util.*;


public class Pricelist {
    private static HashMap<Id, Data> priceCurrent = new HashMap<Id, Data>();

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

    public void changeName(Data data, Id newIdentify) { priceCurrent.replace(newIdentify, data); }

    /**
    public Map<Id, Data> sum (Map<Integer, Integer> receipt) {

    }

     */


    public Map<Id, Data> getPriceList() {
        return priceCurrent;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Id, Data> res: priceCurrent.entrySet()){
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
        return priceCurrent.equals(priceCurrent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceCurrent);
    }
}
