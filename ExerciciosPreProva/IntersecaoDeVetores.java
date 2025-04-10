import java.util.Scanner;
import java.util.ArrayList;

public class IntersecaoDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        ArrayList<Integer> intersecao = new ArrayList<>();

        
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor1[" + i + "]: ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor2[" + i + "]: ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j] && !intersecao.contains(vetor1[i])) {
                    intersecao.add(vetor1[i]);
                }
            }
        }

        System.out.println("\nInterseção dos vetores (sem repetição):");
        if (intersecao.isEmpty()) {
            System.out.println("Nenhum elemento em comum.");
        } else {
            for (int num : intersecao) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
