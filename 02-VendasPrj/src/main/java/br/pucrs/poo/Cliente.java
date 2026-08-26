package br.pucrs.poo;

//tentar fazer uma alteração com o "abstract" para ver as alterações práticas no código
//e de preferência utiliza-lá para entender melhor
public class Cliente {
    private int codigo;
    private String nome;

    public Cliente(int umCodigo, String umNome) {
        this.codigo = umCodigo;
        this.nome = umNome;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        /*
         * return "Cliente{" +
         * "codigo=" + codigo +
         * ", nome='" + nome + '\'' +
         * '}';
         */
        return String.format("(%d) \t %s", codigo, nome);
    }

}
