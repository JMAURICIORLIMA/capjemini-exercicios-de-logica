package br.com.capjemini.algoritimos.aula8;

import java.util.Random;

public class Condicionais {

    public static void main(String[] args) {

        int pontosLeve = 3;
        int pontosMedio = 4;
        int pontosGrave = 5;
        int pontosGravissimo = 7;
        
        double valorMultaLeve = 88.38;
        double valorMultaMedia = 130.16;
        double valorMultaGrave = 195.23;
        double valorMultaGravissima = 293.47;
        
        double velocidadeMultaLeve, velocidadeMultaMedia, velocidadeMultaGrave, velocidadeMultaGravissima;

        velocidadeMultaLeve = 50 * 1.1;
        velocidadeMultaMedia = 70;
        velocidadeMultaGrave = 90;
        velocidadeMultaGravissima = 110;

        int min = 30;
        int max = 160;

        Random random = new Random();

        int velocidadeVeiculo = random.nextInt(max - min + 1) + min;

        String mensagem = "";


        System.out.println("Velocidade do veículo: KM/h " + velocidadeVeiculo);
        
        if (velocidadeVeiculo >= velocidadeMultaGravissima) {
            mensagem = pontosGravissimo + " pontos na carteira, infração gravissima e multa de R$ " + valorMultaGravissima;
        } else if (velocidadeVeiculo >= velocidadeMultaGrave && velocidadeVeiculo < velocidadeMultaGravissima) {
            mensagem = pontosGrave + " pontos na carteira, infração grave e multa de R$ " + valorMultaGrave;
        } else if (velocidadeVeiculo >= velocidadeMultaMedia && velocidadeVeiculo < velocidadeMultaGrave) {
            mensagem = pontosMedio + " pontos na carteira, infração média e multa de R$ " + valorMultaMedia;
        } else if (velocidadeVeiculo >= velocidadeMultaLeve && velocidadeVeiculo < velocidadeMultaMedia) {
            mensagem = pontosLeve + " pontos na carteira, infração leve e multa de R$ " + valorMultaLeve;
        } else {
            mensagem = "Isento";
        }

        System.out.println(mensagem);
    }
}
