package br.com.capjemini.algoritimos.aula16;

import java.util.Scanner;

public class Repita {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String resposta;
        String senha = "1532";
        String mensagem = "";
        int i = 0;


        do {

            System.out.println("Digite a senha do programa.");
            resposta = entrada.nextLine();

            i++;

            if (i == 5) {
                break;
            }

        } while (!senha.equals(resposta));

        if (i >= 5) {
            mensagem = "Erro! Tentativas excedidadas";
        } else {
            mensagem = "Senha correta... Bem vindo(a).";
        }

        System.out.println(mensagem);
    }
}
