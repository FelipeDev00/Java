package Scanner;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Iniciar o código sempre com Scanner e depois as variáveis

        int idade, meses;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        meses = idade * 12;
        System.out.println("A pessoa viveu " + meses + " meses");
        
        entrada.close(); //Fechar o Scanner assim que acabar as entradas de dados do usuário.
    }
}
