package br.com.digitalhouse.Exercicio02;

public class CamaroteSuperior extends Vip {

    //Atributos
    private float valorAdicional;
    private String localizacaoIngresso;

    //Construtor

    //Getter and Setter
    @Override
    public float getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    //Métodos
    public void imprimirLocalizacao(){
        System.out.println("Localização: " + localizacaoIngresso);
    }

    public float consultarValorIngresso(){
        return valorReais + valorAdicional;

    }


}
