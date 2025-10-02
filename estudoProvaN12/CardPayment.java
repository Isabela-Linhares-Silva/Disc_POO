package estudoProvaN12;

public class CardPayment extends Payment{
        private String paymentType;

    CardPayment(double value){
        super(value);
        paymentType = "Card";
    }

    public void process(){
        System.out.println("Valor: "+ getValue());
        System.out.println("Tipo de pagemento: "+paymentType);
    }

    
}
