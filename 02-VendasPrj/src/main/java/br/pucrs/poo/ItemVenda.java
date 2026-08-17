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

    //public String getDetalhe(){
    //  return String.format(format: "(%d) %-15s \t %d X %6.2f  %6.2f",
    //                               prod.getCodigo(), prod.getNome(), this.quantitdade,
    //                               prod.getPreco(), this.getValor() );
    //}

    @Override
    public String toString() {
        String saida = quantidade + "x " + produto.getNome() + " = R$ " + getValor();
        return saida;
        //return "ItemVenda [quantidade=" + quantidade + ", prod=" + prod + "]";
    }
}
