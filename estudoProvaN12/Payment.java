package estudoProvaN12;

public abstract class Payment {

    private double value;

    Payment(double value){
        this.value = value;
    }
    
    public double getValue(){
        return value;
    }

    public abstract void process();
}
