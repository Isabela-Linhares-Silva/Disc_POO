package estudoProvaN12;

import java.util.ArrayList;

public class PaymentProgram {
    public static void main(String[] args) {
        Payment tipo1= new PixPayment(100, "Pix");
        Payment tipo2 = new BoletoPayment(2050, "Boleto");
        Payment tipo3 = new CardPayment(60);

        ArrayList<Payment> pay = new ArrayList<>();
        pay.add(tipo3);
        pay.add(tipo2);
        pay.add(tipo1);

        for(Payment p : pay ){
            p.process();
        }
    }
}
