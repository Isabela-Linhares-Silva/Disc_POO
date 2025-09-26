package src;

public class ativ1 {
    public static void main(String[] args) {
        

        Casa casa1 = new Casa(5,4,"Centro");// obeto tem acesso a tudo que é estatico e que nao eh
        Casa casa2 = new Casa();
        Casa casa3 = new Casa("Centro");
        

        // casa1.exibeCasa();
        // casa2.exibeCasa();
        // casa3.exibeCasa();
        // casa1.addPorta();
        // casa1.exibeCasa();

        System.out.println(casa1.getNumPortas());
        casa1.setNumPortas(50);
        System.out.println(casa1.getNumPortas());


        Aluguel aluguel1 = new Aluguel(5,7,"fortalcity",1500);
        System.out.println(aluguel1.getEndereco());
        aluguel1.setValorAluguel(2000);
        aluguel1.setNumPortas(5);


        //Aluguel aluguel2 = new Casa(2,1,"centro");// nao é possivel
        Casa casa4 = new Aluguel(2, 6, "sul",1000);

        VendaCasa venda1 = new VendaCasa(7, 15, "Norte", 500000);

        System.out.println(venda1.getValorVenda());

        venda1.exibeCasa();
        System.out.println("--------------------------------------");

        System.out.println(aluguel1.comissaoVendedor()); 



        aluguel1.exibeCasa();
    }
    
}
