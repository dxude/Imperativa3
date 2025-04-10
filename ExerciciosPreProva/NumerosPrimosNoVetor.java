import java.util.Scanner;

public class NumerosPrimosNoVetor {
    
    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        
        System.out.println("\nNúmeros primos e suas posições:");
        for (int i = 0; i < 10; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println("Número primo: " + vetor[i] + " | Posição: " + i);
            }
        }

        scanner.close();
    }
}
