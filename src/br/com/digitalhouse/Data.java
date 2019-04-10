package br.com.digitalhouse;

public class Data {

    //Atributos
    private Integer dia;
    private Integer mes;
    private Integer ano;

    //Construtor
    public Data(Integer dia, Integer mes, Integer ano){

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){

    }

    //Getter and Setter
    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
