package br.com.digitalhouse;

public class Gerente extends Funcionario {

    //Atributos
    private String area;

    //Construtor
    public Gerente(String nome, Data nascimento, Float salario, String area) {
        super(nome, nascimento, salario);

        this.area = area;
    }

    public Gerente() {

    }

    //Getter and Setter
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //Método imprimeDados
    @Override
    public void imprimeDados() {

        System.out.println(
                "Nome: " + getNome() +
                " Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno() +
                " Salário: " + getSalario() +
                " Area: " + area);

    }

    //Método calculaImpoosto
    @Override
    public Float calculaImposto() {
        return salario * 0.05f; //Imposto = 5% do salário
    }

}
