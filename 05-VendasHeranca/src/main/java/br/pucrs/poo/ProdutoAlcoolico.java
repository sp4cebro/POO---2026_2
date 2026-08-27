package br.pucrs.poo;

//provavelmente fazer alguma alteração direta com a classe Produto para implementar
//a porcentagem estatica dessa classe
public class ProdutoAlcoolico extends Produto {
    private static double taxa_trago = 0.20;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco){
        super(umCodigo, umNome, umPreco);
    }

    public double getTaxa(){ return taxa_trago;
    }

    public static void setTaxa(double novaTaxa){
        taxa_trago = novaTaxa;
    }

    public double getPreco(){
        double precoBase = super.getPreco();
        return precoBase + (precoBase * taxa_trago);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("[Preço c/ Taxa (%.0f%%): R$ %.2f]", getTaxa() * 100, getPreco());
    }
}
