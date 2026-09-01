package br.pucrs.poo;

//provavelmente fazer alguma alteração direta com a classe Produto para implementar
//a porcentagem estática dessa classe
public class ProdutoAlcoolico extends Produto {
    private static double taxa_trago = 0.20;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco) {
        super(umCodigo, umNome, umPreco);
    }

    public double getTaxa() {
        return taxa_trago;
    }

    public static void setTaxa(double novaTaxa) {
        taxa_trago = novaTaxa;
    }

    // conferir porque não está alterando o preço...
    public double valorTotal() {
        return super.getPreco() * taxa_trago;
    }

    @Override
    public double getPreco() {
        double precoBase = super.getPreco();
        return precoBase + (precoBase * taxa_trago);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" [Taxa (%.0f%%) incluso no preço: R$ %.2f", taxa_trago * 100, getPreco());
    }
}

// código antigo - o mesmo feito em aula
// a princípio os dois devem fazer quase as mesmas coisas, mas esse tem
// métodos a mais do que o atual
// public class ProdutoAlcoolico extends Produto {
// private static double taxa_trago = 0.20;
//
// public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco){
// super(umCodigo, umNome, umPreco);
// }
//
// public double getTaxa(){ return taxa_trago;
// }
//
// public static void setTaxa(double novaTaxa){
// taxa_trago = novaTaxa;
// }
//
// public double getPreco(){
// double precoBase = super.getPreco();
// return precoBase + (precoBase * taxa_trago);
// }
//
// @Override
// public String toString() {
// return super.toString() + String.format("[Preço c/ Taxa (%.0f%%): R$ %.2f]",
// getTaxa() * 100, getPreco());
// }
// }
