package br.com.digitalhouse;

public abstract class Pessoa {

    //Atributos
    private String nome;
    private Data nascimento;

    //Construtor
    public Pessoa(String nome, Data nascimento){

        this.nome = nome;
        this.nascimento = nascimento;

    }

    public Pessoa(){

    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    //Método imprimeDados
    public abstract void imprimeDados();

}
