package br.com.capjemini.algoritimos.aula27;

import java.util.Random;
import java.util.Scanner;

public class FuncaoEProcedimento {

    static Scanner entrada = new Scanner(System.in);

    static Random random = new Random();

    static int numeroAleatorio = 0;

    static int aleatorio() {
        return numeroAleatorio = random.nextInt(20) + 1;
    }

    static int lado1, lado2, lado3;

    static void entradaDeDados() {
        System.out.println("Lado 1");
        lado1 = aleatorio();
        System.out.println("Lado 2");
        lado2 = aleatorio();
        System.out.println("Lado 3");
        lado3 = aleatorio();
    }

    static boolean isTriangulo() {
        if ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)) {
            return false;
        } else {
            return true;
        }
    }

    static String tipoTriangulo() {
        if ((lado1 == lado2) && (lado2 == lado3)) {
            return "Equilátero";
        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
            return "Isórceles";
        }else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {

        entradaDeDados();
        System.out.printf("""
                Lado1 [%d]
                Lado2 [%d]
                Lado3 [%d]
                """, lado1, lado2, lado3);
        if (isTriangulo()) {
            System.out.println(tipoTriangulo());
        } else {
            System.out.println("Não é triângulo.");
        }

    }
}
