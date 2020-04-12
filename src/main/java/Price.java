import java.util.Objects;

public class Price {


    private int rubles;
    private int penny;

    Price(int rubles, int penny) {
        this.rubles = rubles;
        this.penny = penny;
    }


    public int getRubles() {
        //if (rubles == 0 && penny == 0) throw new IllegalArgumentException("Price cannot be zero");
        //if (rubles < 0) throw new IllegalArgumentException("Rubles cannot be less than zero");
        return rubles;
    }

    public int getPenny() {
       // if (rubles == 0 && penny == 0) throw new IllegalArgumentException("Price cannot be zero");
       // if (penny < 0) throw new IllegalArgumentException("Penny cannot be less than zero");
        // if (penny > 99) throw new IllegalArgumentException("Penny cannot be more than ninety nine");
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
