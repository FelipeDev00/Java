import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        int conta;
        String agencia, NomeCliente;
        Double saldo = 300.00;

        System.out.println("Por favor, digite o número da Agência:");
        agencia = entrada.next();

        System.out.println("Agora, digite o número da conta:");
        conta = entrada.nextInt();

        System.out.println("E para finalizar, por favor, digite seu nome completo:");
        NomeCliente = entrada.next();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$"+saldo + " já está disponivel para saque.");
        entrada.close();
    }
}
