package br.pucrs.poo;

//um inicio, tem que verificar se está correto caso esteja - gigachad mesmo
//Produtos Eletrônicos
import java.time.LocalDate;

public class ProdutoEE extends Produto {
    private int diasGarantia;

    public ProdutoEE(int umCodigo, String umNome, double umPreco, int umDias) {
        super(umCodigo, umNome, umPreco);
        this.diasGarantia = umDias;
    }

    // dar um jeito de fazer o get retornar uma String
    public int getDias() {
        return diasGarantia;
    }

    public String getGarantia() {
        LocalDate hoje = LocalDate.now();
        LocalDate vencimento = hoje.plusDays(diasGarantia);
        return String.format("%s - Garantia: %d dias - Comprado em: %s - Vence em %s",
                getNome(), diasGarantia, hoje, vencimento);
    }

    @Override
    public String toString() {
        return super.toString() + " [Dias de Garantia: " + diasGarantia + "]";
    }
}
