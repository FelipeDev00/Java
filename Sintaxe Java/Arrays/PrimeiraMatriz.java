package Arrays;

import java.util.Random;

public class PrimeiraMatriz
{

    public static void main(String[] args) {
        int[][] numAleatorio = new int[3][4];
        Random numeroRandom = new Random();

        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                numAleatorio[i][j] = numeroRandom.nextInt(10);//gera número aleatório de 0 a 10
            }
        }

        System.out.print("\t\tMatriz\n");
        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                System.out.print("\t" + numAleatorio[i][j] + " ");
            }
            System.out.println();       
        }
    }

}
