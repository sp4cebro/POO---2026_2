package br.pucrs.poo;

//provavelmente fazer alguma alteração direta com a classe Produto para implementar
//a porcentagem estatica dessa classe
public class ProdutoAlcoolico extends Produto {
    private static double taxa_trago = 200;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco){
        super(umCodigo, umNome, umPreco);
    }

    public double getTaxa(){ return taxa_trago;
    }

    public double valorTotal(){
        return super.getPreco() * taxa_trago;
    }

    @Override
    public String toString() {
        return super.toString() + "[Preço: "+super.getPreco()+" * taxa "+getTaxa()+" = "+ valorTotal()+ "]";
    }
}
