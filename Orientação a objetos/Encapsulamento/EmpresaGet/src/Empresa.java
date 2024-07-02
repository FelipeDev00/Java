public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario gerente;
    public Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios)
    {
        funcionarios = new Funcionario[numeroFuncionarios];
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente){
        this.gerente = gerente;
    }
}
