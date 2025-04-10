public class VetorSemMultiplosDe7 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int numero = 1;
        int i = 0;

        while (i < 100) {
            if (numero % 7 != 0 && numero % 10 != 7) {
                vetor[i] = numero;
                i++;
            }
            numero++;
        }

        
        System.out.println("Vetor com 100 primeiros naturais que não são múltiplos de 7 e não terminam com 7:");
        for (int j = 0; j < 100; j++) {
            System.out.print(vetor[j] + " ");
        }
    }
}
