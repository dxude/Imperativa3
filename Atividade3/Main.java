package Atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numPessoas;
        System.out.print("Digite o número de pessoas a serem entrevistadas: ");
        numPessoas = sc.nextInt();
        
        int idadeMaisPesada = 0;
        double pesoMaisPesado = 0;
        double somaPesoHomensMenos30 = 0;
        int totalHomensMenos30 = 0;
        int totalMulheres = 0;
        int mulheresMenos50Kg = 0;
        
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            
            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                idadeMaisPesada = idade;
            } else if (peso == pesoMaisPesado) {
            
                idadeMaisPesada = idade;
            }
            
            
            if (sexo == 'M' || sexo == 'm') {
                if (idade < 30) {
                    somaPesoHomensMenos30 += peso;
                    totalHomensMenos30++;
                }
            }
            
            
            if (sexo == 'F' || sexo == 'f') {
                totalMulheres++;
                if (peso < 50) {
                    mulheresMenos50Kg++;
                }
            }
        }
        
        
        double mediaPesoHomensMenos30 = 0;
        if (totalHomensMenos30 > 0) {
            mediaPesoHomensMenos30 = somaPesoHomensMenos30 / totalHomensMenos30;
        }
        
        
        double percentualMulheresMenos50Kg = 0;
        if (totalMulheres > 0) {
            percentualMulheresMenos50Kg = (mulheresMenos50Kg * 100.0) / totalMulheres;
        }
        
        
        System.out.println("\nResultado:");
        System.out.println("Idade da pessoa mais pesada: " + idadeMaisPesada);
        System.out.println("Média de peso dos homens com menos de 30 anos: " + mediaPesoHomensMenos30);
        System.out.println("Percentual de mulheres com menos de 50 kg: " + percentualMulheresMenos50Kg + "%");
        
        sc.close();
    }
}
