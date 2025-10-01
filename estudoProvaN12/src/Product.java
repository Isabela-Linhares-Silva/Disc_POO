package estudoProvaN12.src;

public class Product {
    public int cod;
    public String nome;
    public double preco;
    public double desconto;

    public Product(int cod, String nome, double preco){
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }

    public void desconto(double percent){
        desconto = preco*(percent/100);

    }

    public double mostraComDesconto(){
        return preco - desconto;
    }
    

    public String toString(){
        return "Produto: "
        + nome
        + " |Codigo: "
        + cod 
        + " |Preco: "
        + preco 
        + " |Desconto: "
        + mostraComDesconto();
    }

}
