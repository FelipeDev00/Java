import java.util.Scanner;

public class EstruturaCase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        int opcao;

        System.out.println("Escolha o número da opção desejada:\n 1 - Java \n 2 - JDK.");
        opcao = entrada.nextInt();

        entrada.close();

        switch (opcao) {

            case 1:

                System.out.println("Java é uma linguagem de programação e plataforma computacional");
                break;

            case 2:

                System.out.println("É um pacote de software que você pode usar para desenvolver aplicativos baseados em Java.");
                break;
        
            default:

                System.out.println("Opção inválida. Verifique a opção e tente novamente.");
                break;
        }






















    }
}
