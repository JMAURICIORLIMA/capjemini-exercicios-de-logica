package br.com.capjemini.algoritimos.aula6;

import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        String resultado = "";

        System.out.println("Infome nota 1");
        nota1 = teclado.nextDouble();

        System.out.println("Infome nota 2");
        nota2 = teclado.nextDouble();

        System.out.println("Infome nota 3");
        nota3 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        resultado = media < 7 ? "Você está de RECUPERAÇÃO!" : "Parabéns, você está APROVADO!";

        System.out.println(resultado);

    }
}
