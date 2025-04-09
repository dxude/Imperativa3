
    import java.util.Scanner;

    public class QuadradoDosNumeros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            double[] numeros = new double[10];     
            double[] quadrados = new double[10];    
    
    
            System.out.println("Digite 10 números reais:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextDouble();
                quadrados[i] = Math.pow(numeros[i], 2);  
            }
    
    
            System.out.println("\nVetor original:");
            for (int i = 0; i < 10; i++) {
                System.out.print(numeros[i] + " ");
            }
    
            System.out.println("\n\nVetor com os quadrados:");
            for (int i = 0; i < 10; i++) {
                System.out.print(quadrados[i] + " ");
            }
    
            scanner.close();
        }
    }
    



