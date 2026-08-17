package br.pucrs.poo;

public class ItemVenda {
    private int quantidade;
    private Produto produto;

    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double getValor() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        String saida = quantidade + "x " + produto.getNome() + " = R$ " + getValor();
        return saida;
    }
}
