import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String cargo;
    private LocalDate nascimento;
    private double salario;

    public Funcionario(String nome, String cargo, LocalDate nascimento, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public LocalDate getNascimento () {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}



