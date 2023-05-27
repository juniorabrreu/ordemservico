package Model;
public class ModelFuncionarios {
    private String nome;
    private String dataNasc;
    private String CPF;
    private String funcao;
    public ModelFuncionarios(String nome, String dataNasc, String CPF, String funcao, int matricula) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.CPF = CPF;
        this.funcao = funcao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public String getFuncao() {
        return funcao;
    }   
}
