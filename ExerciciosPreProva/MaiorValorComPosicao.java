import java.util.Scanner;

public class MaiorValorComPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];


        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }


        int maior = vetor[0];
        int posicao = 0;

        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }


        System.out.println("\nVetor completo:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }


        System.out.println("\n\nMaior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicao);

        scanner.close();
    }
}
