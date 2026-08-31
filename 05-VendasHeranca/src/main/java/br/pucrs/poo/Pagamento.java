package br.pucrs.poo;

//um começo né
public class Pagamento {
    private double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public void setValor(double novoValor){
        valor = novoValor;
    }

    public double getValor() {
        return valor;
    }
}
