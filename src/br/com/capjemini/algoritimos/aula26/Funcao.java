package br.com.capjemini.algoritimos.aula26;

public class Funcao {

    static int multiplicador(int numero, int numero2) {
        return numero * numero2;
    }

    static void somar(int numero, int numero2) {
        int soma = numero + numero2;
        System.out.println("Soma = " + soma);
        System.out.println("Multiplicador = " + multiplicador(numero, numero2));
    }

    public static void main(String[] args) {

        somar(10, 5);

    }
}
