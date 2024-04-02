package Arrays;

import java.util.Scanner;

public class AcimaDaMedia
{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtdeAlunos, qtdeAcimaMedia;
        float soma, media;
        
        System.out.println("Quantos alunos serão informados?");
        qtdeAlunos = entrada.nextInt();
        
        //declarando o vetor usando o valor da variável qtdeAlunos para a quantidade de elementos
        float[] notas = new float[qtdeAlunos];
        soma = 0;
        
        //vetor.length é uma propriedade que traz o número de elementos de um vetor
        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = entrada.nextFloat();
            soma += notas[i];
        }
        entrada.close();
        //calculando a média a partir do somatório obtido no laço anterior
        media = soma / qtdeAlunos;
        System.out.println("Média " + media);
        
        qtdeAcimaMedia = 0;
                
        for(int i = 0; i < notas.length; i++)
        {
            if(notas[i] > media)
            {
                System.out.println("Nota " + notas[i] + " acima da média.");
                qtdeAcimaMedia++;
            }
        }
        
        System.out.println("Foram no total " + qtdeAcimaMedia + " notas acima da média");
    }
}