import java.util.Scanner;

public class VetorUtils {

    public static void preencherVetor(int[] v, int n) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            v[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];
        preencherVetor(vetor, n);

        System.out.println("Vetor preenchido:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
