package estudoProvaN12;

public class BoletoPayment extends Payment{
    private String paymentType;

    BoletoPayment(double value, String paymentType){
        super(value);
        this.paymentType = paymentType;
    }

    public void process(){
        System.out.println("Valor: "+ getValue());
        System.out.println("Tipo de pagemento: "+paymentType);
    }
}
