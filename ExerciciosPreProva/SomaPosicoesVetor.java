import java.util.Scanner;

public class SomaPosicoesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[8];

        
        System.out.println("Digite 8 números inteiros para o vetor:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Posição [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        
        int x, y;
        do {
            System.out.print("\nDigite o índice X (0 a 7): ");
            x = scanner.nextInt();
        } while (x < 0 || x > 7);

        do {
            System.out.print("Digite o índice Y (0 a 7): ");
            y = scanner.nextInt();
        } while (y < 0 || y > 7);

    
        int soma = vetor[x] + vetor[y];

    
        System.out.println("\nValor na posição X (" + x + "): " + vetor[x]);
        System.out.println("Valor na posição Y (" + y + "): " + vetor[y]);
        System.out.println("Soma dos valores: " + soma);

        scanner.close();
    }
}
