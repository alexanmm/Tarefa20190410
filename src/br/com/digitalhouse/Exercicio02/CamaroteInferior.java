package br.com.digitalhouse.Exercicio02;

public class CamaroteInferior extends Vip {

    //Atributos
    private String localizacaoIngresso;

    //Construtor
    public CamaroteInferior(float valorReais, float valorAdicional, String localizacaoIngresso) {
        super(valorReais, valorAdicional);

        this.localizacaoIngresso = localizacaoIngresso;
    }

    public CamaroteInferior() {
        super();

    }

    //Getter and Setter
    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    //Métodos
    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso: " + (valorReais + valorAdicional));
    }

    public void imprimirLocalizacao(){
        System.out.println("Localização: " + localizacaoIngresso);
    }


}
