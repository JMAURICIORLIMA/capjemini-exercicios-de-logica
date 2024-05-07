package br.com.capjemini.algoritimos.aula10;

import java.util.Random;

public class Triangulo {

    static Random random = new Random();

    static int min = 1;
    static int max = 20;

    static int geradorAleatorio() {
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {

        double lado1, lado2, lado3;

        lado1 = geradorAleatorio();
        lado2 = geradorAleatorio();
        lado3 = geradorAleatorio();

        String mensagem = "";

        if ((lado1 > lado2 + lado3) || (lado1 > lado1 + lado3) || (lado3 > lado1 + lado2)) {
            mensagem = "Não é triângulo";
        } else if ((lado1 == lado2) && lado2 == lado3) {
            mensagem = "Equilátero";
        } else if ((lado1 == lado2) || (lado2 == lado3) || lado1 == lado3) {
            mensagem = "Isórceles";
        } else {
            mensagem = "Escaleno";
        }

        System.out.println("L1 = " + lado1 + "\nL2 = " + lado2 + "\nL3 = " + lado3);
        System.out.println(mensagem);
    }
}
