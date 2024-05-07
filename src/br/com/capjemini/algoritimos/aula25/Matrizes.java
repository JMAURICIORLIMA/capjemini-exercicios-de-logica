package br.com.capjemini.algoritimos.aula25;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamanhoDoArray = 10;
        String[][] cadeiras = new String[tamanhoDoArray + 1][tamanhoDoArray + 1];
        int fila, poltrona;


        for (int i = 1; i < cadeiras.length; i++) {
            for (int j = 1; j < cadeiras.length; j++) {
                cadeiras[i][j] = "0";
            }
        }

        String opcao = " ";

        do {
            System.out.println("""
                    
                    1 - Mostrar Layout do Cinema
                    2 - Reservar
                    3 - Sair
                    """);
            opcao = entrada.next();

            switch (opcao) {
                case "1":

                    for (int i = 1; i <= cadeiras.length - 1; i++) {
                        for (int j = 1; j <= cadeiras.length - 1; j++) {
                            System.out.print(" " + cadeiras[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                    break;

                case "2":
                    System.out.println("Fila");
                    fila = entrada.nextInt();
                    System.out.println("Poltrona");
                    poltrona = entrada.nextInt();

                    if (cadeiras[fila][poltrona].equals("0")) {
                        cadeiras[fila][poltrona] = "X";
                        System.out.printf("""
                                Concluíndo reserva:
                                Fila [ %d ] Poltrona [ %d ]
                                """, fila, poltrona);
                    } else {
                        System.out.println("Poltrona já reservada.");
                    }
                    break;

                case "3":
                    System.out.println("Encerrando....");
                    break;
                default:
                    System.out.println("Opção inválida. Escola uma das opções listadas.");

            }

        } while (!opcao.equals("3"));
    }
}
