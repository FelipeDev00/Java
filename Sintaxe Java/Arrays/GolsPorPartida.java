package Arrays;
import java.util.Scanner;

public class GolsPorPartida {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----Gols por partida-----");
        System.out.println("Digite o número de partidas que você quer somar os gols:");
        int partidas = entrada.nextInt();

        int [] gols = new int [partidas]; 
        int soma = 0;
        for(int i = 0; i < gols.length; i++ ) {

            System.out.println("Digite os gols da " + (i + 1) + "ª" + " partida:");
            gols[i] = entrada.nextInt();
            soma += gols[i];
        }
        entrada.close();
        System.out.println("A soma dos gols é igual a: " + soma);
    }
}