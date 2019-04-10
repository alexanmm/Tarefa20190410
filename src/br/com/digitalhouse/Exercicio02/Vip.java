package br.com.digitalhouse.Exercicio02;

public abstract class Vip extends Ingresso{

    //Atributos
    protected float valorAdicional;

    //Construtor
    public Vip(float valorReais, float valorAdicional) {
        super(valorReais);

        this.valorAdicional = valorAdicional;
    }

    public Vip() {

    }

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
