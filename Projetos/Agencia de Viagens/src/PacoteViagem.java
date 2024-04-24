public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int QuantDias;


    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int QuantDias){
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.QuantDias = QuantDias;
    } 

    public String getDestino(){
        return destino;
    }

    public double calcularTotal(double margemLucro, double taxaAdicional){
        double totalHospedagem = hospedagem.calcularTotal(QuantDias);
        double lucro = transporte.getValor() * (1 + margemLucro / 100);
        return transporte.getValor() + totalHospedagem + lucro + taxaAdicional;
    }

}
