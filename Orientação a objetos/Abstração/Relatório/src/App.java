public class App {
    public static void main(String[] args) {
        RelatorioVenda relVendas = new RelatorioVenda();
        relVendas.vendas = new Venda[]{new Venda(100, "Maria"), new Venda(150, "Joao"), new Venda(100, "Antonio")};  
        relVendas.nomeEmpresa = "Empresa XYZ S.A.";
        relVendas.emiteRelatorio();       
    }
}
