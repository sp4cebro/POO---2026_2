package br.pucrs.poo;

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(int umCodigo, String umNome, String umCNPJ){
        super(umCodigo, umNome);
        this.cnpj = umCNPJ;
    }

    public String getCNPJ(){ return cnpj;
    }

    @Override
    public String toString() {
        // ficou feio - de acordo com o sor mesmo kk
        //return super.getCodigo() + "[cnpj= "+cnpj+"]";

        //reutilizando o toString da Classe Cliente
        return super.toString() + " [cnpj = " + cnpj + "]";
    }
}
