package br.com.capjemini.algoritimos.aula23;

import java.util.Random;

public class Vetores {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[10];

        int[] numerosInvertidos = new int[numeros.length];

        int aux = numeros.length - 1;

        System.out.println("Numeros aleatórios.");
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = random.nextInt(100) + 1;
            numeros[i] = aleatorio;
        }

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[aux] = numeros[i];
            aux--;
        }

        System.out.println("Numeros aleatórios com ordem invertida.");
        for (int numero : numerosInvertidos) {
            System.out.print(numero + " ");
        }

        System.out.println(" ");

        int[] soma = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            soma[i] = numeros[i] + numerosInvertidos[i];
        }

        System.out.println("Soma");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d + %d = %d %n", numeros[i], numerosInvertidos[i], soma[i]);
        }

        int[] subtracao = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            subtracao[i] = numeros[i] - numerosInvertidos[i];
        }

        System.out.println("Subtração");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d - %d = %d %n", numeros[i], numerosInvertidos[i], subtracao[i]);
        }

    }
}
