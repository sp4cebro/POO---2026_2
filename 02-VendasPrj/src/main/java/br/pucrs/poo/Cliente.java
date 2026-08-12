package br.pucrs.poo;

public class Cliente{
    private String nome;
    private int codigo;

    public Cliente(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public String toString(){
        String saida = "Nome: "+getNome()+"\nCódigo: "+getCodigo();
        return saida;
    }
}
