import java.util.*;


public class Pricelist {
    private static HashMap<Id, Price> priceCurrent = new HashMap<Id, Price>();

    //add - добавляет запись по заданным id и продуктам
    void add(Id identify, Price price) {

        priceCurrent.put(identify, price);
        if (priceCurrent.isEmpty()) {
            throw new IllegalArgumentException("price current can't be empty");
        }
        if (identify.getId() < 0) throw new IllegalArgumentException("Id cannot be less than zero");
    }

    //del - удаляет записи по id
    void del(Id identify) {
        priceCurrent.remove(identify);
    }

    void changePrice(Id identify, Price newPrice) {
        priceCurrent.replace(identify, newPrice);
    }

    void changeName(Id oldId, Price price, String name) {
        if (oldId.getId() < 0) throw new IllegalArgumentException("Id cannot be less than zero");

        Id newId = new Id(oldId.getId(), name);
        priceCurrent.remove(oldId);
        priceCurrent.put(newId, price);
    }

    Double sum(Id id, int count,Sum sum) {
        Sum currentSum = sum;
        for (Map.Entry<Id,Price> entry: priceCurrent.entrySet()) {
            if (entry.getKey().equals(id)) {
                currentSum.sum += (entry.getValue().getRubles() + entry.getValue().getPenny()/100.0)*count;
            }
        }
        return currentSum.sum;
    }


    Map<Id, Price> getPriceList() {
        return priceCurrent;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Id, Price> res : priceCurrent.entrySet()) {
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
