package br.pucrs.poo;

public class Venda {
    private Cliente cliente;
    private ItemVenda[] itens;
    private int qtdItens;

    public Venda(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ItemVenda[50];
        this.qtdItens = 0;
    }

    public void inserir(Produto prod){
        inserir(1, prod);
    }

    public void inserir(int umaQtde, Produto prod){
        itens[qtdItens] = new ItemVenda(umaQtde, prod);
        qtdItens++;
    }

    public double valorTotal(){
        double total = 0;
        for(int i = 0; i < qtdItens; i++){
            total+= itens[i].getValor();
        }
        return total;
    }

    public String getNotaFiscal(){
        return toString();
    }

    @Override
    public String toString(){
        String saida = "Venda\nCliente: " + cliente.getNome() + "\n";
        for(int i = 0; i < qtdItens; i++) {
            saida += itens[i] + "\n";
        }
        saida += "Total: R$ " + valorTotal();
        return saida;
    }
}
