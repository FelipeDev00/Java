package Arrays;

public class vetor {
    public static void main(String[] args) {
        
        int [] numeros = new int [10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100);
            System.out.println("Número: " + numeros[i]);
        }
    }
}
