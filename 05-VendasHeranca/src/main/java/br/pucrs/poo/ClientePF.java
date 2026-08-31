package br.pucrs.poo;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(int umCodigo, String umNome, String umCPF){
        super(umCodigo, umNome);
        this.cpf = umCPF;
    }

    public String getCPF(){ return cpf;
    }

    //@Override
    //public String toString() {
        // ficou feio - de acordo com o sor mesmo kk
        //return super.getCodigo() + "[cpf= "+cpf+"]";

        //reutilizando o toString da Classe Cliente
        //return super.toString() + " [cpf = " + cpf + "]";
    //}
    //novo 31.08
    @Override
    public String getID(){
        return cpf;
    }
}
