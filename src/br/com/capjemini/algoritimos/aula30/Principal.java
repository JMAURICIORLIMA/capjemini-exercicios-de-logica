package br.com.capjemini.algoritimos.aula30;

public class Principal {

    public static void main(String[] args) {

        CadastroCliente cliente1 = new CadastroCliente();

        cliente1.nome = "Armanda";
        cliente1.rg = "5134122";
        cliente1.idade = 32;

        System.out.printf("""
                Nome: %s
                Rg: %s
                Idade: %d
                """,
                cliente1.nome, cliente1.rg, cliente1.idade);

    }
}
