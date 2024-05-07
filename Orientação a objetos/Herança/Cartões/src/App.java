import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        CartaoDebito debito = new CartaoDebito();
        CartaoCredito credito = new CartaoCredito();
        Cartao cartao = new Cartao();

        System.out.println("----- CADASTRAMENTO DE CARTÃO -----");
        System.out.println("Informe o tipo do cartão que deseja cadastrar: credito / debito");
        cartao.tipoCartao = entrada.nextLine();

        if (cartao.tipoCartao.equalsIgnoreCase("credito") ){
            System.out.println("Informe o número do cartão: ");
            credito.numeroCartao = entrada.nextLine();
            System.out.println("Insira o nome do portador: ");
            credito.nomePortador = entrada.nextLine();
            System.out.println("Insirta a data da validade do cartão: ");
            credito.validade = entrada.nextLine();
            System.out.println("Insira o código de segurança do cartão: ");
            credito.codigoSeguranca = entrada.nextLine();
            System.out.println("Informe o limite do cartão: ");
            credito.limite = entrada.nextInt();
            System.out.println("CARTÃO DE CRÉDITO CADASTRADO COM SUCESSO!");
        }
        else if (cartao.tipoCartao.equalsIgnoreCase("debito")){
            System.out.println("Informe o número do cartão: ");
            debito.numeroCartao = entrada.nextLine();
            System.out.println("Insira o nome do portador: ");
            debito.nomePortador = entrada.nextLine();
            System.out.println("Insirta a data da validade do cartão: ");
            debito.validade = entrada.nextLine();
            System.out.println("Insira o código de segurança do cartão: ");
            debito.codigoSeguranca = entrada.nextLine();
            System.out.println("Informe o saldo atual da conta: ");
            debito.saldoAtual = entrada.nextDouble();
            System.out.println("CARTÃO DE DÉBITO CADASTRADO COM SUCESSO!");
        }
        else {
            System.out.println("Tipo de cartão inválido.");
        }
        System.out.println("Insira um valor de compra: ");
        cartao.valorCompra = entrada.nextDouble();

        if (cartao.tipoCartao.equalsIgnoreCase("credito") && cartao.valorCompra > credito.limite) {
            System.out.println("VOCÊ NÃO TEM LIMITE O SUFICIENTE PARA ESSA COMPRA! ");
        }
        else if (cartao.tipoCartao.equalsIgnoreCase("debito") && cartao.valorCompra > debito.saldoAtual) {
            System.out.println("VOCÊ NÃO TEM SALDO O SUFICIENTE PARA ESSA COMPRA!");
        }
        else {System.out.println("Sucesso! pode realizar sua compra sem problemas!");}
        entrada.close();
    }
}
