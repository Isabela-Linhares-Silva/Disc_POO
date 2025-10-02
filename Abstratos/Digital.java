package Abstratos;

public class Digital extends Game{

    private String code;

    Digital(String title, float price, String code){
        super(title, price);
        this.code = code;
    }

    public void printGame(){
        System.out.println("Titulo: "+getTitle());
        System.out.println("Preco: "+getPrice());
        System.out.println("Codigo: "+code);
    }

}
