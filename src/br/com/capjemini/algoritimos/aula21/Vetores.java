package br.com.capjemini.algoritimos.aula21;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] idades = new int[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome: ");
            nomes[i] = entrada.next();
            System.out.print("Informe a idade: ");
            idades[i] = entrada.nextInt();
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + nomes[i] + " Idade: " + idades[i]);
        }
    }
}
