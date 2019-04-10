package br.com.digitalhouse.Exercicio01;

public class Cliente extends Pessoa{

    //Atributos
    private Integer codigo;

    //Construtor
    public Cliente(String nome, Data nascimento, Integer codigo) {
        super(nome, nascimento);

        this.codigo = codigo;
    }

    public Cliente() {

    }

    //Getter and Setter
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    //Método imprimeDados
    @Override
    public void imprimeDados() {
        System.out.println(
                "Nome: " + getNome() +
                 " Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno() +
                 "Código: " + codigo);
    }
}
