package br.com.capjemini.algoritimos.aula4;

import java.util.Scanner;

public class ModDiv {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x;

        System.out.print("Infome um número: ");
        x = teclado.nextInt();

        String mensagem = x % 2 == 1 ? "Número Impar" : "Número Par";

        System.out.println(mensagem);

    }
}
