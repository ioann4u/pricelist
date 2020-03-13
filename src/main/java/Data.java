import java.util.Objects;

public class Data {

    private String name;
    private int rubles;
    private int penny;

    public Data(String name, int rubles, int penny) {
        this.name = name;
        this.rubles = rubles;
        this.penny = penny;

        if (rubles <= 0 || penny <= 0) return;
    }

    public String getName() {
        return name;
    }

    public int getRubles() {
        return rubles;
    }

    public int getPenny() {
        return penny;
    }

    @Override
    public String toString() {
        return name + " - " + rubles + " руб. " + penny + " коп.";
    }

    @Override
    public boolean equals(Object data){
        if (data == this) {
            return true;
        }
        if (data == null || data.getClass() != this.getClass()) {
            return false;
        }
        Data dat = (Data) data;
        return rubles == dat.rubles && penny == dat.penny && Objects.equals(name, dat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rubles, penny);
    }
}
