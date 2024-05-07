package br.com.capjemini.algoritimos.aula9;

import java.util.Random;

public class TabelaVerdade {

    static Random random = new Random();

    static int min = 1;
    static int max = 20;

    static int geradorAleatorio() {
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {

        int i, j;

        i = geradorAleatorio();
        j = geradorAleatorio();

        String mensagem = "";

        /*
        TABELA VERDADE E (&&)

        V && v = v
        v && F = F
        F && V = F
        F && F = F
         */

        if ((i <= 10) && (j > i)) {
            mensagem = "Fazer algo";
        } else {
            mensagem = "Não fazer nada";
        }

        System.out.println("i = " + i + "\n j = " + j);
        System.out.println(mensagem);

        /*
        TABELA VERDADE OU (||)

        V || v = v
        v || F = V
        F || V = V
        F || F = F
        */

        if ((i <= 10) || (j > i)) {
            mensagem = "Fazer algo";
        } else {
            mensagem = "Não fazer nada";
        }

        System.out.println("i = " + i + "\n j = " + j);
        System.out.println(mensagem);
    }
}
