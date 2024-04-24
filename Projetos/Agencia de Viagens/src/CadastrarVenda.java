import java.util.Scanner;

public class CadastrarVenda {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);

        System.out.println("----- Cadastro de pacote de viagem -----");

        System.out.println("Informe o tipo de transporte: ");
        String tipo = entrada.nextLine();
        System.out.print("Informe o valor do transporte em dólar: ");
        double valor = entrada.nextDouble();
        Transporte transporte = new Transporte(tipo, valor);

        entrada.nextLine(); 
        System.out.print("Informe a descrição da hospedagem: ");
        String descricaoHospedagem = entrada.nextLine();
        System.out.print("Informe o valor da diária da hospedagem em dólar: ");
        double valorDiariaHospedagem = entrada.nextDouble();
        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiariaHospedagem);

        entrada.nextLine(); 
        System.out.print("Informe o destino da viagem: ");
        String destino = entrada.nextLine();
        System.out.print("Informe a quantidade de dias da viagem: ");
        int quantidadeDias = entrada.nextInt();
        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);

        System.out.println("\n----- Informações do Pacote de Viagem -----");
        System.out.println("Transporte: " + transporte.getTipo() + ", Valor: $" + transporte.getValor());
        System.out.println("Hospedagem: " + hospedagem.getDesc() + ", Valor diária: $" + hospedagem.getValorDiaria());
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Total do Pacote em dólar: $" + pacoteViagem.calcularTotal(20, 50));

        entrada.nextLine(); 
        System.out.println("\n----- Cadastro de Venda -----");
        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = entrada.nextLine();
        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = entrada.nextLine();
        System.out.print("Informe a cotação do dólar no dia: ");
        double cotacaoDolar = entrada.nextDouble();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);
        venda.mostrarInformacoes(cotacaoDolar);

        entrada.close();
    }
}
