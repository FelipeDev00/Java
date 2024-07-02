public class CarroApp {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Ka", "Ford", 2020, "Branco");
        Carro carro2 = new Carro("Gol", "Volkswagen", 2010, "Rosa");
                
        
        System.out.println("Dados do carro1: ");
        System.out.println("Modelo do primeiro carro é: "+carro1.getModelo());
        carro1.setModelo("Ranger");
        System.out.println("Modelo do primeiro carro após o método SET: "+carro1.getModelo());
        
        
        System.out.println("\nDados do carro2: ");
        System.out.println("Marca do segundo carro é: "+carro2.getMarca());
        carro2.setModelo("Volks");
        System.out.println("Marca do segundo carro após o método SET: "+carro2.getMarca());

    }

}
