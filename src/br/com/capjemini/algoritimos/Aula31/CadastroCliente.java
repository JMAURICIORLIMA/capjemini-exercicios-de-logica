package br.com.capjemini.algoritimos.Aula31;

public class CadastroCliente {

    String nome;
    String rg;
    int idade;

    public CadastroCliente(String nome, String rg, int idade) {
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
    }

    public void imprime() {
        System.out.printf("""
                
                Nome: %s
                Idade: %d
                Rg: %s
                
                """,
                this.nome, this.idade, this.rg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
