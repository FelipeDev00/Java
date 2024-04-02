package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SegundaMatriz {

    public static void main(String[] args) {
        float NOTA[][] = new float[4][3];
        byte I, J;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        for (I = 0; I <= 3; I++) {
            System.out.println();
            System.out.println();
            System.out.println("Aluno ---> " + (I + 1));
            System.out.println();
            for (J = 0; J <= 2; J++) {
                System.out.print((J + 1) + "ª Nota = ");
                NOTA[I][J] = s.nextFloat();
            }
        }
        System.out.println();
        System.out.println("Aluno Nota1 Nota2 Nota3 Nota4");
        System.out.println("-----------------------------");
        for (I = 0; I <= 3; I++) {
            System.out.print((I + 1) + " --> ");
            for (J = 0; J <= 2; J++) {
                System.out.print(df.format(NOTA[I][J]) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
