public class Price {
    private int rubles ;
    private int penny;

    public Price(int rubles, int penny){
        this.rubles = rubles;
        this.penny = penny;

        if (rubles < 0 || penny < 0) return;
        if (rubles == 0 && penny == 0) return;
    }

    public String value (){
        return rubles + "р" + penny + "к";
    }
}
