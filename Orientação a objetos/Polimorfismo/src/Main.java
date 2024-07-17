//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal pato = new Pato();
        Animal gato = new Gato();

        cachorro.falar(); // "Au au"
        pato.falar(); // "Quack"
        gato.falar(); // "Miau"
    }
}
