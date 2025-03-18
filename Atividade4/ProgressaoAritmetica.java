package Atividade4;

import java.util.Scanner;

public class  ProgressaoAritmetica{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial da progressão: ");
        int valorInicial = sc.nextInt();

        System.out.print("Digite o fator de incremento: ");
        int incremento = sc.nextInt();

        System.out.print("Digite a quantidade de termos: ");
        int quantidadeTermos = sc.nextInt();

        System.out.print("Progressão Aritmética: ");
        for (int i = 0; i < quantidadeTermos; i++) {
            System.out.print(valorInicial + (i * incremento));
            if (i < quantidadeTermos - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
