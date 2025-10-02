package estudoProvaN12;

public class PixPayment extends Payment{
    private String paymentType;

    PixPayment(double value, String paymentType){
        super(value);
        this.paymentType = paymentType;
    }

    public void process(){
        System.out.println("Valor: "+ getValue());
        System.out.println("Tipo de pagemento: "+paymentType);
    }
}
