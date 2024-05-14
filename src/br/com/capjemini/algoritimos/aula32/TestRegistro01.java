package br.com.capjemini.algoritimos.aula32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRegistro01 {

    static List<Registro> registroList = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    static String opcao = "";

    static void menu() {
        System.out.println("""
                                
                *****     MENU     *****
                  Digite uma das opções
                1 - Cadastrar
                2 - Pesquisar
                3 - Imprimir
                4 - Sair
                                
                """);

        opcao = entrada.next();
    }

    static void cadastrar() {
        System.out.print("Nome: ");
        String nome = entrada.next().toUpperCase();
        System.out.print("RG: ");
        String rg = entrada.next();
        System.out.print("Idade: ");
        int idade = entrada.nextInt();


        registroList.add(new Registro(nome, rg, idade));
    }

    static void pesquisar() {
        System.out.print("Pesquisar: ");
        String nomeBuscado = entrada.next().toUpperCase();
        boolean encontrado = buscarNome(registroList, nomeBuscado);

        if (encontrado) {
            System.out.println("O nome: [" + nomeBuscado + "] está cadastrado.");
        } else {
            System.out.println("O nome: [" + nomeBuscado + "] não está cadastrado.");
        }

    }

    static boolean buscarNome(List<Registro> registros, String nomeBuscado) {
        for (Registro registro : registros) {
            if (registro.getNome().equals(nomeBuscado)) {
                return true;
            }
        }
        return false;
    }

    static void imprime() {
        for (Registro registro : registroList) {
            registro.imprime();
        }
    }


    public static void main(String[] args) {

        do {
            menu();

            switch (opcao) {
                case "1":
                    cadastrar();
                    break;

                case "2":
                    pesquisar();
                    break;

                case "3":
                    imprime();
                    break;

                case "4":
                    System.out.println("Finalisando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (!opcao.equals("4"));
    }
}
