package br.com.capjemini.algoritimos.aula28;

import java.util.Scanner;

public class FuncaoEProcedimento {

    static Scanner entrada = new Scanner(System.in);

    static String opcaoMenu;
    static String[] clientes = new String[5];

    static void mostrarMenu() {
        System.out.println("""
                1 - Cadastrar
                2 - Pesquisar
                3 - Listar
                4 - Excluir
                """);
        opcaoMenu = entrada.next();
    }

    static void cadastrar() {

        for (int i = 0; i < 5; i++) {
            if (clientes[i] == null || clientes[i].equals("")) {
                System.out.print("Informe nome do cliente: ");
                clientes[i] = entrada.next().toUpperCase();
            }
        }
    }

    static void pesquisar() {

        int indiceSucesso = -1;
        System.out.print("Pesquisa por cliente: ");
        String nomeAPesquisar = entrada.next().toUpperCase();
        for (int i = 0; i < 5; i++) {
            if (clientes[i].equals(nomeAPesquisar)) {
                indiceSucesso = i;
                break;
            }
        }

        if (indiceSucesso == -1) {
            System.out.println("Cliente não encontrado");
        } else {
            System.out.println("Cliente encontrado no indice [" + indiceSucesso + "]");
        }
    }

    static void listar() {
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }

    static void excluir() {

        System.out.print("Cliente a ser excluído - informe o indice: ");
        int indiceExclusao = entrada.nextInt();
        if (indiceExclusao > 4 || indiceExclusao < 0) {
            System.out.println("Indice inválido");
        } else {
            clientes[indiceExclusao] = "";
        }

    }


    public static void main(String[] args) {

        do {
            mostrarMenu();

            switch (opcaoMenu) {
                case "1":
                    cadastrar();
                    break;

                case "2":
                    pesquisar();
                    break;

                case "3":
                    listar();
                    break;

                case "4":
                    excluir();
                    break;

                case "0":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");

            }

        } while (!opcaoMenu.equals("0"));
    }

}
