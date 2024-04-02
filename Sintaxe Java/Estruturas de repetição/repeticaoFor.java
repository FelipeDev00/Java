import java.util.Scanner;

public class repeticaoFor { //Calculo de tabuada
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, resultado;

        System.out.println("Informe o número: ");
        numero = entrada.nextInt();

        entrada.close();
        
        for(int i = 1; i <= 10; i++)
        {
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
