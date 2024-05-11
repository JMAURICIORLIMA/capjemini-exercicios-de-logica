package br.com.capjemini.algoritimos.aula29;

import java.util.Scanner;

public class Exercicio {

    static Scanner entrada = new Scanner(System.in);

    static String[] gabarito = new String[10];

    static String opcaoMenu;

    static int notaFinal;

    static void mostrarMenu() {
        System.out.println("""
                1 - Cadastrar Gabatito
                2 - Cadastrar Prova
                3 - Sair
                """);
        opcaoMenu = entrada.next();
    }

    static void cadastrarGabarito() {
        for (int i = 0; i < gabarito.length; i++) {
            System.out.println("Informe a resposta da questão [" + (i+1) + "]");
            gabarito[i] = entrada.next();
        }
    }

    static int cadastrarProva() {
        int nota = 0;
        String resposta = "";
        for (int i = 0; i < gabarito.length; i++) {
            System.out.println("Informe a questão [" + (i+1) + "]");
            resposta = entrada.next();
            if (resposta.equals(gabarito[i])) {
                nota++;
            }
        }
        return nota;
    }

    static String verificaSituacao(int nota) {
        if (nota >= 7) {
            return "Aprovado";
        } else if (nota < 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }

    public static void main(String[] args) {

        do {

            mostrarMenu();

            switch (opcaoMenu) {
                case "1":
                    cadastrarGabarito();
                    break;

                case "2":
                    System.out.println(notaFinal = cadastrarProva());
                    System.out.println(verificaSituacao(notaFinal));
                    break;

                case "3":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (!opcaoMenu.equals("3"));

    }
}
