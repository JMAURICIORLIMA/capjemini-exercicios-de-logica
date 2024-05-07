package br.com.capjemini.algoritimos.aula5;

import java.util.Scanner;

public class TrabalhandoComTipos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, soma, subtracao, multiplcacao;
        double divisao;
        boolean sucesso = false;
        String mensagem = "";

        System.out.print("N1: ");
        numero1 = teclado.nextInt();

        System.out.print("N2: ");
        numero2 = teclado.nextInt();


        soma = numero1 + numero2;
        System.out.println(soma);

        subtracao = numero1 - numero2;
        System.out.println(subtracao);

        multiplcacao = numero1 * numero2;
        System.out.println(multiplcacao);

        divisao = numero1 / numero2; // Divisão imprecisa por estar recebendo numeros inteiros para divisão.
        System.out.println(divisao);

        System.out.print("N1: ");
        numero1 = teclado.nextInt();

        sucesso = numero1 > 10;
        mensagem = sucesso ? "Verdade" : "Falso";

        System.out.println("Numero recebido maio que 10? " + mensagem);
    }
}
