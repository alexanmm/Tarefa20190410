package br.com.digitalhouse.Exercicio02;

public abstract class Ingresso {

    //Atributos
    protected float valorReais;

    //Construtor
    public Ingresso(float valorReais){

        this.valorReais = valorReais;

    }

    public Ingresso(){

    }

    //Getter and Setter
    public float getValorReais() {
        return valorReais;
    }

    public void setValorReais(float valorReais) {
        this.valorReais = valorReais;
    }

    //Método imprimeValor
    public abstract void imprimeValor();

}
