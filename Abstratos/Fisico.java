package Abstratos;

public class Fisico extends Game{
    private String gameLot;

    Fisico(String title, float price, String gameLot){
        super(title, price);
        this.gameLot = gameLot;
    }

    public void printGame(){
        System.out.println("Titulo: "+getTitle());
        System.out.println("Preco: "+getPrice());
        System.out.println("Lote: "+gameLot);
    }
}
