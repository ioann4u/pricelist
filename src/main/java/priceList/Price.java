package priceList;

import java.util.Objects;

public class Price {

    private int rubles;
    private int penny;

    Price(int rubles, int penny) {
        //if (rubles < 0) throw new IllegalArgumentException("Rubles cannot be less than zero");
        //if (penny < 0) throw new IllegalArgumentException("Penny cannot be less than zero");
        //if (penny > 99) throw new IllegalArgumentException("Penny cannot be more than ninety nine");
        //if (rubles == 0 && penny == 0) throw new IllegalArgumentException("priceList.Price cannot be zero");

        this.rubles = rubles;
        this.penny = penny;
    }

    int getRubles() {
        return rubles;
    }

    int getPenny() {
        return penny;
    }

    @Override
    public String toString() {
        return rubles + " руб. " + penny + " коп.\n";
    }

    @Override
    public boolean equals(Object data){
        if (data == this) {
            return true;
        }
        if (data == null || data.getClass() != this.getClass()) {
            return false;
        }
        Price dat = (Price) data;
        return rubles == dat.rubles && penny == dat.penny;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rubles, penny);
    }
}
