public class Hospedagem {
    private String descricao;
    private double valorDiaria;

    public Hospedagem(String descricao, double valorDiaria){
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }
    // Desc = descrição
    public String getDesc(){
        return descricao;
    }
    public double getValorDiaria(){
        return valorDiaria;
    }

    public double calcularTotal(int QuantDias) {
        return valorDiaria * QuantDias;
    }
}
