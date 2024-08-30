package org.filme;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        int anoDeLancamento;
        String nomeFilme;
        double avaliacao;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        nomeFilme = ler.nextLine();
        System.out.println("Qual o ano de laçamento? ");
        anoDeLancamento = ler.nextInt();
        System.out.println("Diga sua avaliação para o filme: ");
        avaliacao = ler.nextDouble();

        System.out.println("Filme: " + nomeFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("nota: " + avaliacao);
    }

}
