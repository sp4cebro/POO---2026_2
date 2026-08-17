package br.pucrs.poo;

public class Venda {
    private Cliente cliente;
    private ItemVenda[] itens;
    private int qtdItens;

    public Venda(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ItemVenda[50];
        //this.itens = new ArrayLista<>(); - o que o professor fez em aula
        this.qtdItens = 0;
    }

    public void inserir(Produto prod){
        inserir(1, prod);
        //this.inserir(1, prod); - o que o professor fez em aula
    }

    public void inserir(int umaQtde, Produto prod){
        itens[qtdItens] = new ItemVenda(umaQtde, prod);
        qtdItens++;
        //itens.add(new ItemVenda( qtde, prod)); - o que o professor fez em aula
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
    // como o professor fez essa classe getNotaFiscal()
    //public String getNotaFiscal() {
    //  double total = 0;
    //  StringBuilder nota = new StringBuilder(str: "Exercício POO 2026/2\t");
    //  nota.append(LocalDateTime.now().toLocalDate() + "\n");
    //  nota.append("Comprador: " + cliente.getNome());
    //  nota.append(str:"\n -------------");
    //
    //  não devemos mais usar for tradicional...
    //  for(int i = 0; i < itens.size(); i++){
    //    ItemVenda item = lista.get(i);
    //  }
    //  ... com foreach exatamente o mesmo efeito
    //  for(ItemVenda: itens) {
    //      nota.append(item.getDetalhe() + "\n");
    //      //nota.append(str:"\n");
    //      total = total + item.getValor();
    //  }
    //  nota.append(str: "\n--------------");
    //  nota.append(String.format(format: "\t\tTotal: R$ %.2f\n\n", total));
    //  return note.toString();
    //  }

    @Override
    public String toString(){
        String saida = "Venda\nCliente: " + cliente.getNome() + "\n";
        for(int i = 0; i < qtdItens; i++) {
            saida += itens[i] + "\n";
        }
        saida += "Total: R$ " + valorTotal();
        return saida;
    }

    //public String toString(){
    //  return "Venda [cliente]"
    //}
}
