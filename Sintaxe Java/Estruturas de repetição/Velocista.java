import java.util.Scanner;

public class Velocista
{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float tempoVolta, menorTempo;
        String continuar = "S";
        
          //inicializando o menor tempo com o maior valor possível
          // (qualquer primeiro valor informado será menor que este)
        menorTempo = Float.MAX_VALUE;
        
        while(continuar.equals("S"))
        {
            System.out.print("Informe o tempo (s) da volta do velocista:");
            tempoVolta = entrada.nextFloat();

              //este nextLine é necessário para que o próximo nextLine, ao fim do laço, não falhe
              entrada.nextLine(); //consome o "enter" digitado pelo usuário

            if(menorTempo > tempoVolta)
            {
                menorTempo = tempoVolta;
            }

            System.out.print("Deseja informar novo tempo? S/N ");
            continuar = entrada.nextLine();
        }
        entrada.close();
        System.out.println("A menor volta do velocista foi de " + menorTempo + " segundos.");
        
    }
    
}
