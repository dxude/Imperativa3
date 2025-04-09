import java.util.Scanner;

public class VetorQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 10;
        double[] vetorOriginal = new double[TAMANHO]; 
        double[] vetorQuadrado = new double[TAMANHO]; 

        
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextDouble();
            vetorQuadrado[i] = vetorOriginal[i] * vetorOriginal[i]; 
        }

        
        System.out.println("\nVetor Original:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }

        System.out.println("\n\nVetor com os Quadrados:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetorQuadrado[i] + " ");
        }

        scanner.close();
    }







    }

