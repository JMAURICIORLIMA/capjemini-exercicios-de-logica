package br.com.capjemini.algoritimos.aula19;

import java.util.Scanner;

public class Para {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int inicio, fim, passo = 0;

        System.out.println("Inicio");
        inicio = entrada.nextInt();

        System.out.println("Fim");
        fim = entrada.nextInt();

        System.out.println("Passo");
        passo = entrada.nextInt();

        if (inicio < fim) {

            for (int i = inicio; i <= fim; i += passo) {
                System.out.println(i + " ");
            }

        } else {
            for (int i = inicio; i >= fim; i -= passo) {
                System.out.print(i + " ");
            }
        }
    }
}
