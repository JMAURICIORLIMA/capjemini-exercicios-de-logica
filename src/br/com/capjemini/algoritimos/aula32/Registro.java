package br.com.capjemini.algoritimos.aula32;

public class Registro {

    private String nome;
    private String rg;
    private int idade;

    public Registro(String nome, String rg, int idade) {
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
    }

    public void imprime() {
        System.out.printf("""
                
                Nome: %s
                Idade: %d
                RG: %s
                
                """,
                this.nome, this.idade, this.rg);
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }
}
