package src;

public class Casa {
    private int numPortas;
    private int numJanelas;
    private String endereco;

    //Construtor
    Casa(int numPortas, int numJanelas, String endereco){
        this.numPortas = numPortas;//se forem nomes iguais utiliza-se o this e é uma boa pratica utilizar o mesmo
        this.numJanelas = numJanelas;
        this.endereco = endereco;
    }
    Casa(){ }
    Casa(String endereco){
        this.endereco = endereco;
    }

    public void exibeCasa(){
        System.out.println("Endereco: "+ endereco );
        System.out.println("Numero de portas: "+numPortas);
        System.out.println("Numero de janelas: "+numJanelas);   

    }

    public void addPorta(){
        numPortas++;
    }

    // metodos acessadores(encapsulamento)
    public int getNumPortas() {
        return numPortas;
    }
    //permite que outras classes acessem de forma segura
    public int getNumJanelas() {
        return numJanelas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public float comissaoVendedor(){
        return 0;
    }

}
