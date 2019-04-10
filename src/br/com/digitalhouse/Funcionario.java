package br.com.digitalhouse;

public class Funcionario extends Pessoa {

    //Atributos
    protected Float salario;

    //Construtor
    public Funcionario(String nome, Data nascimento, Float salario) {
        super(nome, nascimento);

        this.salario = salario;
    }

    public Funcionario() {

    }

    //Getter and Setter
    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    //Método imprimeDados
    @Override
    public void imprimeDados() {
        System.out.println(
                "Nome: " + getNome() +
                " Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno() +
                " Salario: " + salario);

    }

    //Método calculaImposto
    public Float calculaImposto(){
        return salario * 0.03f; //Imposto = 3% do salário
    }

}
