package br.com.capjemini.algoritimos.aula11;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double altura, peso, imc;
        String mensagem = "";

        System.out.println("Informe sua altura, por favor");
        altura = entrada.nextDouble();

        System.out.println("Informe seu peso, por gentileza");
        peso = entrada.nextDouble();

        imc = peso / (Math.pow(2, altura));

        if (imc < 19) {
            mensagem = "Abaixo de peso";
        } else if (imc >= 19 && imc < 24) {
            mensagem = "Peso ideal";
        } else {
            mensagem = "Acima do peso";
        }

        System.out.println(mensagem + " IMC " + imc);

    }
}
