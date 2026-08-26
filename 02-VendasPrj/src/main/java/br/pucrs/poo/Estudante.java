package br.pucrs.poo;

public class Estudante extends ClientePF {
    //private String matricula;
    private String instituicao;

    public Estudante(int umCodigo, String umNome, String umCPF, String umInst) {// String umMatricula
        super(umCodigo, umNome, umCPF);
        // this.matricula = umMatricula;
        this.instituicao = umInst;
    }

    // public String getMatricula(){ return matricula;
    // }

    public String getInstituicao() {
        return instituicao;
    }

    @Override
    public String toString() {
        // ficou feio - de acordo com o sor mesmo kk
        // return super.getCodigo() + "[cpf= "+cpf+"]";

        // reutilizando o toString da Classe Cliente
        return super.toString() + " [Institução = " + instituicao + "]";
    }
}
