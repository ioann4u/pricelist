public class Data {

    private String name;
    private int rubles;
    private int penny;

    public Data (String name, int rubles, int penny){
        this.name = name;
        this.rubles = rubles;
        this.penny = penny;

        if (rubles <= 0 || penny <= 0) return;
    }

    public String strData(){
        return name + " - " + rubles + " руб. " + penny + " коп.";
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
}
