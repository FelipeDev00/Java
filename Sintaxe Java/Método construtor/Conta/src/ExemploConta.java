public class ExemploConta {

    public static void main(String[] args) {
        Conta minhaConta1 = new Conta(39185, "Roberto", 2000, 5000);
        Conta minhaConta2 = new Conta(203947, "João");

        System.out.println("\n" + minhaConta1.nome + " " + minhaConta1.saldo);
        System.out.println(minhaConta2.nome);
    }
}