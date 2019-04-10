package br.com.digitalhouse.Exercicio02;

public abstract class Vip extends Ingresso{

    //Atributos
    private float valorAdicional;

    //Construtor

    //Getter and Setter
    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    //Método consultarValorIngressoVip
    public float consultarValorIngressoVip(){

        return valorReais + valorAdicional;
    }

}
