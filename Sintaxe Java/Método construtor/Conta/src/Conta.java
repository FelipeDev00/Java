public class Conta{

    int numero;
    String nome;
    double saldo;
    double limite;

    public Conta(int numero, String nome, double saldo, double limite){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }
    public Conta (int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
}


