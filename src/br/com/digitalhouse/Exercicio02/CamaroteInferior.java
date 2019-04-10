package br.com.digitalhouse.Exercicio02;

public class CamaroteInferior extends Vip {

    //Atributos
    private String localizacaoIngresso;

    //Construtor

    //Getter and Setter
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


}
