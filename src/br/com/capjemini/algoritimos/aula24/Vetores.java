package br.com.capjemini.algoritimos.aula24;

import java.util.Random;

public class Vetores {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[10];
        int auxiliar = 0;

        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = random.nextInt(100) + 1;
            numeros[i] = aleatorio;
        }

        for (int numero : numeros) {
            System.out.printf("%d ", numero);
        }

        System.out.println("\n*-------------------------------*");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] > numeros[i]) {
                    auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }

        for (int numero : numeros) {
            System.out.printf("%d ", numero);
        }
    }
}
