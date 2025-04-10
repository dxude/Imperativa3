import java.util.Scanner;

public class MaiorValorComPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        // Leitura dos 10 números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        // Encontrar o maior valor e sua posição
        int maior = vetor[0];
        int posicao = 0;

        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        // Imprimir o vetor
        System.out.println("\nVetor completo:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Mostrar
        System.out.println("\n\nMaior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicao);

        scanner.close();
    }
}
