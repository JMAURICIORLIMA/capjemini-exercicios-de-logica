package br.com.capjemini.algoritimos.aula3;

import java.util.Scanner;

public class TrabalhandoComTipos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String palavra1, palavra2, palavra3;
        int numero1, numero2, numero3;

        System.out.print("Palavra1: ");
        palavra1 = teclado.next();

        System.out.print("Palavra2: ");
        palavra2 = teclado.next();

        System.out.print("Numero1: ");
        numero1 = teclado.nextInt();

        System.out.print("Numero2: ");
        numero2 = teclado.nextInt();

        palavra3 = palavra1 + palavra2;
        numero3 = numero1 + numero2;

        System.out.println(palavra3);
        System.out.println(numero3);


//        palavra3 = palavra1 - palavra2; Errp de compilação
        numero3 = numero1 - numero2;

//        System.out.println(palavra3);
        System.out.println(numero3);


    }
}
