package br.pucrs.poo;

public class Produto{
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        String saida = "Código: "+getCodigo()+"\nNome: " +getNome()+"\nPreço(R$): "+getPreco();
        return saida;
    }
}
