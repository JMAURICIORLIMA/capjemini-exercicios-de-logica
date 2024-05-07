package br.com.capjemini.algoritimos.aula20;

import java.util.Random;

public class Aleatorio {

    static Random random = new Random();

//    static int min = 1;
//    static int max = 20;

    static int geradorAleatorio(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {

        int aleatorioMin;
        int aleatorioMax;
        int incremento;

        do {

            aleatorioMin = geradorAleatorio(1, 100);
            aleatorioMax = geradorAleatorio(1, 100);

            System.out.printf("Min %d | Max %d %n", aleatorioMin, aleatorioMax);

        } while (aleatorioMin > aleatorioMax);

        incremento = geradorAleatorio(1, 5);

        System.out.printf("Incremento %d %n", incremento);

        for (int i = aleatorioMin; i <= aleatorioMax; i += incremento) {
            System.out.printf("%d ", i);
        }

        System.out.println("\nFinalizando\n");

    }
}
