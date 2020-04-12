public class Sum {
    double sum;

    Sum() {
        this.sum = 0.0;
    }

    public double getSum(){
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
    public boolean clear(){
        this.sum = 0.0;
        return true;
    }

}
