package br.com.digitalhouse;

import java.util.ArrayList;

public class CadastroPessoas {

    //Atributos
    private int qtdAtual;

    private ArrayList<Pessoa> arrayPessoa = new ArrayList<>();

    //Getter and Setter
    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    //Método cadastraPessoa
    public void cadastraPessoa(Pessoa novaPessoa){

        arrayPessoa.add(novaPessoa);

        this.qtdAtual += 1;

    }

    //Método imprimeCadastro
    public void imprimeCadastro(){

        System.out.println("*** Lista de Pessoas Cadastradas ***");


        for (int posicao = 0; posicao < getQtdAtual(); posicao++){

            System.out.println(
                    "Nome: " + arrayPessoa.get(posicao).getNome() +
                       " Data de Nascimento: " + arrayPessoa.get(posicao).getNascimento());
        }
    }


}
