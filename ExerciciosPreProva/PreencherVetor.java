import java.util.Random;

public class PreencherVetor {
    public static void main(String[] args) {
        int[] vetor = new int[1000]; 
        Random random = new Random(); 
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000) + 1; 
        }

        
        for (int num : vetor) {
            System.out.println(num);
        }
    }

         public static int busca(double[] v, double x) {
        for (int i = 0; i < v.length; i += 1) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }






}


