package br.com.capjemini.algoritimos.aula22;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        String pesquisa = "";
        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Cadastre o usuario: ");
            nomes[i] = entrada.next().toUpperCase();
        }

        System.out.print("Pesquisar: ");
        pesquisa = entrada.next().toUpperCase();

        for (int i = 0; i < nomes.length; i++) {
            if (pesquisa.equals(nomes[i])) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Encontrado [" + pesquisa + "]");
        } else {
            System.out.println("Não encontrado.");
        }

    }
}
