package br.com.digitalhouse.Exercicio02;

public class Normal extends Ingresso{

    //Construtor
    public Normal(float valorReais) {
        super(valorReais);
    }

    public Normal() {
    }

    //Metodos
    @Override
    public void imprimeValor() {

        System.out.println("Valor do ingresso: " + valorReais);

    }

    public void imprimirIngressoNormal(){
        System.out.println("Ingresso Normal");
    }

}
