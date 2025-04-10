import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int contadorPares = 0;

    
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número [" + i + "]: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + contadorPares);

        scanner.close();
    }
}
