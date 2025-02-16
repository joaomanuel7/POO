package lab1.projeto1;

class Pessoa {

    private String nome;
    private int idade;
    private String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome) {
        this.nome = nome;
        this.idade = idade;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}

public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 19, "Zilli");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Sobrenome: " + p.getSobrenome());
        System.out.println("Idade: " + p.getIdade());
    }
}
