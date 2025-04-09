import java.util.Random;

public class FrequenciaValores {

    public static void main(String[] args) {
        System.out.println("---- Usando apenas um vetor e uma variável contador ----");
        contarComUmVetor();

        System.out.println("\n---- Usando vetor extra para contagem ----");
        contarComVetorExtra();
    }

    
    public static void contarComUmVetor() {
        int[] numeros = new int[200];
        Random random = new Random();

    
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
        }

        System.out.println("Valor | Frequência");
        for (int i = 1; i <= 20; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == i) {
                    contador++;
                }
            }
            System.out.printf("  %2d   |    %d\n", i, contador);
        }
    }

  
    public static void contarComVetorExtra() {
        int[] numeros = new int[200];
        int[] frequencia = new int[21]; 
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
            frequencia[numeros[i]]++;
        }

        System.out.println("Valor | Frequência");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("  %2d   |    %d\n", i, frequencia[i]);
        }
    }
}
