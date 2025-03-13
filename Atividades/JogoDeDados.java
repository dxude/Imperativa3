package Atividades;


import java.util.Random;

public class JogoDeDados {
    public static void main(String[] args) {
        Random random = new Random();
        int pontosJogador1 = 0;
        int pontosJogador2 = 0;

        for (int rodada = 1; rodada <= 10; rodada++) {
            int dadoJogador1 = random.nextInt(6) + 1; 
            int dadoJogador2 = random.nextInt(6) + 1;

            System.out.println("Rodada " + rodada + ":");
            System.out.println("Jogador 1: " + dadoJogador1);
            System.out.println("Jogador 2: " + dadoJogador2);

            if (dadoJogador1 > dadoJogador2) {
                System.out.println("Jogador 1 vence a rodada!");
                pontosJogador1++;
            } else if (dadoJogador2 > dadoJogador1) {
                System.out.println("Jogador 2 vence a rodada!");
                pontosJogador2++;
            } else {
                System.out.println("Empate na rodada!");
            }
            System.out.println();
        }

        System.out.println("Pontuação final:");
        System.out.println("Jogador 1: " + pontosJogador1);
        System.out.println("Jogador 2: " + pontosJogador2);

        if (pontosJogador1 > pontosJogador2) {
            System.out.println("Jogador 1 é o grande vencedor!");
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("Jogador 2 é o grande vencedor!");
        } else {
            System.out.println("O jogo terminou em empate!");
        }
    }
}
