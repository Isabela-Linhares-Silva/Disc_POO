package src;



public class ativ1 {
    public static void main(String[] args) {
        

        Casa casa1 = new Casa();//construtores padrão(vazio)
        casa1.numPortas =4;
        casa1.numJanelas = 5;
        casa1.endereco = "Centro";
        Casa casa2 = new Casa();
        casa2.numPortas = 20;
        casa2.numJanelas= 40;
        casa2.endereco = "Interior";

        System.out.println(casa1.endereco);
        System.out.println(casa2.endereco);
        

    }
    
}
