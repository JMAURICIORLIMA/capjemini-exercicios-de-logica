package br.com.capjemini.algoritimos.aula12;

import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String voto = "";
        String mensagem = "";

        System.out.println("Informe seu voto: " +
                "\n20 - Frajola" +
                "\n30 - Pernalonga" +
                "\n40 - Patolino");
        voto = entrada.next();

        switch (voto) {
            case "20" :
                mensagem = "Você votou no Frajola";
                break;
            case "30" :
                mensagem = "Você votou no Pernalonga";
                break;
            case "40" :
                mensagem = "Você votou no Patolino";
                break;
            default:
                mensagem = "Voto nulo";
        }

        System.out.println(mensagem);
    }
}
