package br.com.capjemini.algoritimos.aula2;

import java.util.Scanner;

public class TrabalhandoComTiposDeVariaveis {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome, sobrenome, nomecompleto;

        System.out.print("Infome o seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Infome o seu sobrenoem: ");
        sobrenome = teclado.nextLine();

        nomecompleto = nome + " " + sobrenome;

        System.out.println(nomecompleto);
    }
}
