import java.util.*;


public class PriceList {
    private HashMap<Id, Price> priceCurrent = new HashMap<Id, Price>();

    private double sum;

    double getSum() {
        return sum;
    }

    boolean clearSum() {
        this.sum = 0.0;
        return true;
    }

    //add - добавляет запись по заданным id и продуктам
    void add(Id identify, Price price) {
        if (price.getRubles() == 0 && price.getPenny() == 0) throw new IllegalArgumentException("Price cannot be zero");
        priceCurrent.put(identify, price);
    }

    //del - удаляет записи по id
    void del(Id identify) {
        if (!priceCurrent.containsKey(identify))
            throw new IllegalArgumentException("You can't delete an item if it is not");

        priceCurrent.remove(identify);
    }

    void changePrice(Id identify, Price newPrice) {
        priceCurrent.replace(identify, newPrice);
    }

    void changeName(Id oldId, Price price, String name) {
        Id newId = new Id(oldId.getId(), name);
        priceCurrent.remove(oldId);
        priceCurrent.put(newId, price);
    }

    Double sum(Id id, int count) {
        for (Map.Entry<Id, Price> entry : priceCurrent.entrySet()) {
            if (entry.getKey().equals(id)) {
                this.sum += (entry.getValue().getRubles() + entry.getValue().getPenny() / 100.0) * count;
            }
        }
        return this.sum;
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
        PriceList another = (PriceList) full;
        return Objects.equals(priceCurrent, another.priceCurrent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceCurrent);
    }
}
