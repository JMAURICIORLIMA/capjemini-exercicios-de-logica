package br.com.capjemini.algoritimos.aula15;

import java.util.Scanner;

public class Enquanto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*
        Idade mais novo
        Idade mais velho
        Porcentagem de menores de idade
        Media das idades
         */

        int qtdEntrevistado, maisNovo, maisVelho, somaDasIdades;
        double mediaIdade, porcentagemMenorIdade, qtdMenoresIdade;

        maisNovo = 999;
        maisVelho = 0;
        qtdEntrevistado = 1;
        somaDasIdades = 0;
        qtdMenoresIdade = 0;
        mediaIdade = 0;

        while (qtdEntrevistado <= 10) {

            System.out.println("Informe sua idade");
            int idadeInformada = entrada.nextInt();

            somaDasIdades += idadeInformada;
            qtdEntrevistado++;

            if (idadeInformada < maisNovo) {
                maisNovo = idadeInformada;
                qtdMenoresIdade++;
            }
            if (idadeInformada > maisVelho) {
                maisVelho = idadeInformada;
            }
            if (idadeInformada < 18) {
                qtdMenoresIdade++;
            }
        }

        mediaIdade = ((double) somaDasIdades / (qtdEntrevistado - 1));

        porcentagemMenorIdade = (qtdMenoresIdade / qtdEntrevistado) * 100;

        System.out.printf("Menor idade registrada: %d" +
                "%nMaior idade registrada: %d" +
                        "%nPorcentagem menor idade %.1f %%" +
                        "%nMedia Idade %.1f %n",
                maisNovo, maisVelho, porcentagemMenorIdade, mediaIdade);

    }
}
