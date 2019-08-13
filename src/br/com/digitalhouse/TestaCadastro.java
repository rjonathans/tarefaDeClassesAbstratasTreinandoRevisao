package br.com.digitalhouse;

public class TestaCadastro {
    public static void main(String[] args) {

        CadastroPessoas novoCadastro = new CadastroPessoas();

        Data dataCliente1 = new Data(10,12,1995);//data do cliente
        Data dataCliente2 = new Data(25,9,1980);


        Cliente cliente1 = new Cliente("Jessica",dataCliente1,1500f,101);


        Funcionario newFuncionario1 = new Funcionario("José",dataCliente2,1500);

        Gerente newGerente = new Gerente("Airton",dataCliente2,35000,"Develop");

        cliente1.imprimedados();
        newFuncionario1.imprimedados();
        newFuncionario1.calcularImposto();
        newGerente.imprimedados();
        newGerente.calcularImposto();

        novoCadastro.cadastrarPessoa(newFuncionario1);
        System.out.println(novoCadastro);

    }
}
