package br.com.digitalhouse;

public class TeslaCadastro {

    public static void main(String[] args) {

        CadastroPessoas cadastroPessoas = new CadastroPessoas();

        //Inicializa Cliente
        Data dataNascimentoAlexandre = new Data(1, 1, 1982);
        Cliente clienteAlexandre = new Cliente("Alexandre", dataNascimentoAlexandre, 1000);

        //Inicializa Funcionario
        Data dataNascimentoPaulo = new Data(31, 1, 1975);
        Funcionario funcionarioAlexandre = new Funcionario("Alexandre", dataNascimentoAlexandre, 2000.00f);
        Funcionario funcionarioPaulo = new Funcionario("Paulo", dataNascimentoPaulo, 4500.00f);

        //Inicializa Gerente
        Data dataNascimentoCarlos = new Data(10, 5, 1999);
        Gerente gerenteCarlos = new Gerente("Carlos", dataNascimentoCarlos, 5000.00f, "Compras");

        //Cadastra Alexandre
        cadastroPessoas.cadastraPessoa(clienteAlexandre);
        clienteAlexandre.imprimeDados();

        cadastroPessoas.cadastraPessoa(funcionarioAlexandre);
        System.out.println("Calculo do imposto: " + funcionarioAlexandre.calculaImposto());
        funcionarioAlexandre.imprimeDados();

        //Cadastra Paulo
        cadastroPessoas.cadastraPessoa(funcionarioPaulo);
        System.out.println("Calculo do imposto: " + funcionarioPaulo.calculaImposto());
        funcionarioPaulo.imprimeDados();

        //Cadastra Carlos
        cadastroPessoas.cadastraPessoa(gerenteCarlos);
        System.out.println("Calculo do imposto: " + gerenteCarlos.calculaImposto());
        gerenteCarlos.imprimeDados();

        //Imprime todo o cadastro
        cadastroPessoas.imprimeCadastro();

    }

}
