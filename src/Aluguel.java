package src;

public class Aluguel extends Casa{
    private float valorAluguel;

    public Aluguel (int numPortas, int numJanelas, String endereco,float valorAluguel){
        super(numPortas,numJanelas,endereco);
        this.valorAluguel = valorAluguel;
    }

    public float getValorAluguel(){
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel){
        this.valorAluguel = valorAluguel;
    }

    public float comissaoVendedor(){//sobreescrita
        return valorAluguel;
    }

    public void exibeCasa(){
        super.exibeCasa();//exibe oq ue ja tem no 'pai' e sobre escreve o valor do aluguel
        System.out.println("Valor do aluguel: R$ "+valorAluguel);
    }
}
