package org.filme;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
