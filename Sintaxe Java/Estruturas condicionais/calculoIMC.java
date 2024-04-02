public class calculoIMC {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        final int PESO = 80;
        final double ALTURA = 1.85;

        final double IMC = PESO / (ALTURA * ALTURA);
        System.out.println("Seu IMC é de " + IMC);

        if (IMC >= 18.5 && IMC <= 25) {
                System.out.println("você está com peso normal");
            }
        else if (IMC >= 25 && IMC <= 32) {
                System.out.println("você está acima do peso");
            }
        else if (IMC >= 30 && IMC <= 40) {
                System.out.println("você está em obesidade");
            }
        else {
            System.out.println("você está em obesidade grave");
        };
    }
}
