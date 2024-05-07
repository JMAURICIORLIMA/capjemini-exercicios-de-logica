package br.com.capjemini.algoritimos.aula14;

public class Enquanto {

    public static void main(String[] args) {

        int i = 1;


        while (i <= 100) {

            for (int j = 0; j < 10; j += 1) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println("\n");
        }

        System.out.println("Finalizando...");
    }
}
