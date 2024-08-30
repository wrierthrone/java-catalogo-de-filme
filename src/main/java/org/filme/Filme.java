package org.filme;

import java.util.Scanner;

public class Filme {
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

    System.out.println(nomeFilme);
    System.out.println(anoDeLancamento);
    System.out.println(avaliacao);
  }

}
