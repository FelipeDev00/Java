import java.util.Scanner;

public class Quartos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[][] ocupado = new boolean[4][3];

        while (true) {
            System.out.println("Informe Andar e Quarto");
            int andar = scanner.nextInt();
            int quarto = scanner.nextInt();

            if (andar < 1 || andar > 4 || quarto < 1 || quarto > 3) {
                System.out.println("Andar ou quarto inválido. Por favor, tente novamente.");
                continue;
            }

            ocupado[andar - 1][quarto - 1] = true;

            System.out.println("Deseja informar outra ocupação? (S/N)");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Ocupação do hotel:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "º andar:");
            for (int j = 0; j < 3; j++) {
                if (ocupado[i][j]) {
                    System.out.println("- quarto " + (j + 1) + " ocupado");
                } else {
                    System.out.println("- quarto " + (j + 1) + " desocupado");
                }
            }
        }
        scanner.close();
    }
}
