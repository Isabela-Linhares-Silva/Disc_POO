package Excecoes;

public class Conta {
    private Integer numero;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public Conta(Integer numero, String titular, double saldo,double limiteSaque){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque =limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valor)throws SaqueException{
        if (saldo<=0)
            throw new SaqueException("Saldo insuficiente");
        if(valor > limiteSaque)
            throw new SaqueException("Limite ultrapassado");
        saldo -= valor;
    }

}

