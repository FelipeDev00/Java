import java.util.Scanner;

public class TesteTv {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operacao = "";
        byte canal;

        Televisor minhaTV = new Televisor();//instanciando o objeto Televisor
        do
        {
            System.out.println("Digite a operação da TV: [On]Ligar; [Off]Desligar; [T]rocar canal; [+]Aumentar volume; [-]Diminuir volume; [X]Sair; [D] Mostrar display");
            operacao = entrada.nextLine();

            switch(operacao)
            {
                case "On":
                    minhaTV.ligar();
                    minhaTV.display();
                    break;
                case "Off":
                    minhaTV.desligar();
                    break;
                case "T":
                    System.out.print("Digite o canal desejado (entre 2 e 13): ");
                    canal = entrada.nextByte();
                    entrada.nextLine(); //consumir o [enter] digitado após o número
                    minhaTV.trocarCanal(canal);
                    break;
                case "+":
                    minhaTV.aumentarVolume();
                    break;
                case "-":
                    minhaTV.diminuirVolume();
                    break;
                case "X":
                    System.out.println("Encerrando programa");
                    break;
                case "D":
                    minhaTV.display();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(!operacao.equals("X"));

        entrada.close();
    }

}