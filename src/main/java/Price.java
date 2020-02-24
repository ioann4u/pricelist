public class Price {
    private double cost;

    public Price(double cost){
        this.cost = cost;

        if (cost < 0.0 || cost == 0.0) return;
    }
}
