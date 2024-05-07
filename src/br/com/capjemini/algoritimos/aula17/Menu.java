package br.com.capjemini.algoritimos.aula17;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opcaoMenu = "";
        double totalConta = 0;

        do {

            System.out.println("""
                    1 - troca de óleo\

                    2 - Substituição do filtro de óleo\

                    3 - Substituição do filtro de ar de cabine\

                    4 - Finalizar""");

            opcaoMenu = entrada.next();

            switch (opcaoMenu) {
                case "1":
                    totalConta += 80;
                    break;
                case "2":
                    totalConta += 40;
                    break;
                case "3":
                    totalConta += 30;
                    break;
                case "4":
                    System.out.println("Finalizando...");
                default:
                    System.out.println("Opção inválida...");
            }

        } while (!opcaoMenu.equals("4"));

        System.out.printf("Valor final R$ %.2f", totalConta);
    }
}
