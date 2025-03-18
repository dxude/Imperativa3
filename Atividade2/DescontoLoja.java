package Atividade2;

import java.util.Scanner;

public class DescontoLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a categoria do produto (1, 2 ou 3): ");
        int categoria = scanner.nextInt();
        while (categoria < 1 || categoria > 3) {
            System.out.print("Categoria inválida. Informe novamente (1, 2 ou 3): ");
            categoria = scanner.nextInt();
        }
        System.out.print("Informe o preço do produto: R$ ");
        double preco = scanner.nextDouble();
        while (preco <= 0) {
            System.out.print("Preço inválido. Informe novamente o preço: R$ ");
            preco = scanner.nextDouble();
        }
        System.out.print("Informe a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        while (quantidade <= 0) {
            System.out.print("Quantidade inválida. Informe novamente a quantidade: ");
            quantidade = scanner.nextInt();
        }
        double descontoCategoria = 0;
        switch (categoria) {
            case 1:
                descontoCategoria = 0.10;
                break;
            case 2:
                descontoCategoria = 0.15; 
                break;
            case 3:
                descontoCategoria = 0.08; 
                break;
        }
        double descontoQuantidade = 0;
        if (quantidade <= 2) {
            descontoQuantidade = 0.02; 
        } else if (quantidade <= 10) {
            descontoQuantidade = 0.05; 
        } else {
            descontoQuantidade = 0.10; 
        }

       
        double descontoTotal = descontoCategoria + descontoQuantidade;
        double precoComDesconto = preco * (1 - descontoTotal);

        double totalCompra = precoComDesconto * quantidade;
        double economizado = (preco * quantidade) - totalCompra;

        System.out.printf("Preço original por unidade: R$ %.2f\n", preco);
        System.out.printf("Desconto por categoria: %.0f%%\n", descontoCategoria * 100);
        System.out.printf("Desconto por quantidade: %.0f%%\n", descontoQuantidade * 100);
        System.out.printf("Novo preço por unidade: R$ %.2f\n", precoComDesconto);
        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
        System.out.printf("Economia total: R$ %.2f\n", economizado);

        scanner.close();
    }
}


