package br.com.capjemini.algoritimos.aula13;

public class Enquanto {

    public static void main(String[] args) {

        double alturaMarcelo, alturaJoao, crescimentoAnualMarcelo, crescimentoAnualJoao;

        alturaMarcelo = 1.2;
        alturaJoao = 1.05;
        crescimentoAnualMarcelo = 0.05;
        crescimentoAnualJoao = 0.07;
        int idade = 8;

        while (alturaMarcelo >= alturaJoao) {
            alturaMarcelo += crescimentoAnualMarcelo;
            alturaJoao += crescimentoAnualJoao;
            idade++;
        }

        System.out.printf("Idada %d" +
                "%nAltura João %.2f" +
                "%nAltura Marcelo %.2f %n",
                idade, alturaJoao, alturaMarcelo);

    }
}
