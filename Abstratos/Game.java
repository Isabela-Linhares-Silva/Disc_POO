package Abstratos;

public abstract class Game {
    private String title;
    private float price;

    public abstract void printGame();
    //construtor
    Game(String title, float price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

}
