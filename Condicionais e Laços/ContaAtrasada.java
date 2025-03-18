import java.util.Scanner;

public class ContaAtrasada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite o valor da conta: R$ ");
        double valorConta = scanner.nextDouble();
        
        System.out.print("Digite o percentual da multa (ex: 2 para 2%): ");
        double multaPercentual = scanner.nextDouble();
        
        System.out.print("Digite o percentual de juros mensal (ex: 5 para 5%): ");
        double jurosMensal = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de dias em atraso: ");
        int diasAtraso = scanner.nextInt();
        
        
        if (diasAtraso >= 45) {
            System.out.println("Cálculo não permitido. Conta com 45 dias ou mais de atraso.");
        } else {
            
            double valorMulta = valorConta * (multaPercentual / 100);
            
            
            double jurosDiario = (jurosMensal / 30) / 100; 
            double valorJuros = valorConta * jurosDiario * diasAtraso;
            
            
            double valorFinal = valorConta + valorMulta + valorJuros;
            
            
            System.out.println("\nResumo do Cálculo:");
            System.out.printf("Multa: R$ %.2f\n", valorMulta);
            System.out.printf("Juros: R$ %.2f\n", valorJuros);
            System.out.printf("Valor Final: R$ %.2f\n", valorFinal);
        }
        
        scanner.close();
    }
}
