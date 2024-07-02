public class App {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRaio(5.0);
        System.out.println("Area do círculo: " + c.calculaArea());
        
        Retangulo r = new Retangulo();
        r.setAltura(10);
        r.setBase(5);
        System.out.println("Area do quadrado: " + r.calculaArea());
        
        FormaGeometrica formas[] = new FormaGeometrica[2];
        formas[0] = c;
        formas[1] = r;
        
        for(int i=0; i<formas.length; i++)
        {
            System.out.println("Area da forma " + i +": " + formas[i].calculaArea());
            System.out.println("Perímetro da forma " + i +": " + formas[i].calculaPerimetro());
        }
    }
}
