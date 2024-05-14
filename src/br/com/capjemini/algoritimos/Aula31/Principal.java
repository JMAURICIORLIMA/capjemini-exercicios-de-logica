package br.com.capjemini.algoritimos.Aula31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<CadastroCliente> clientes = new ArrayList<>();

        clientes.add(new CadastroCliente("João", "123456", 25));
        clientes.add(new CadastroCliente("Maria", "789012", 30));
        clientes.add(new CadastroCliente("Breno", "165161", 27));

        for (CadastroCliente cliente : clientes) {
            cliente.imprime();
        }


    }
}
