public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem PacoteViagem){
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = PacoteViagem;
    }
    public double convertReal (double valorDolar, double cotacaoDolar){
        return valorDolar * cotacaoDolar;
    }

    public void mostrarInformacoes(double cotacaoDolar){
        double totalDolar = pacoteViagem.calcularTotal(20, 50);
        double totalReais = convertReal(totalDolar, cotacaoDolar);
        System.out.println("----- Informações da Venda -----");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Total do pacote em dólar: " + totalDolar);
        System.out.println("Total do pacote em reais: " + totalReais);
    }






}
