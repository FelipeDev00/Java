import java.util.Scanner;

public class Idade
{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        
        do{
            System.out.println("Informe uma idade válida (entre 0 e 150)");
            idade = entrada.nextInt();
        } while(idade < 0 || idade > 150);

        entrada.close();
        
        System.out.println("obrigado por informar uma idade válida");
    }
    
}
