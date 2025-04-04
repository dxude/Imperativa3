import java.util.Random;

public class VetorAleatorioSemRepeticao {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
        
        embaralharVetor(vetor);
        
        System.out.println("Vetor com 1000 números aleatórios entre 1 e 1000 (sem repetições):");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
    
    public static void embaralharVetor(int[] vetor) {
        Random random = new Random();
        
        for (int i = vetor.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
        }
    }
}