package br.com.digitalhouse.Exercicio02;

public class CamaroteSuperior extends Vip {

    //Construtor
    public CamaroteSuperior(float valorReais, float valorAdicional) {
        super(valorReais, valorAdicional);
    }

    public CamaroteSuperior() {
        super();
    }

    //Métodos
    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso: " + consultarValorIngresso());
    }

    public float consultarValorIngresso(){
        return valorReais + valorAdicional;

    }


}
