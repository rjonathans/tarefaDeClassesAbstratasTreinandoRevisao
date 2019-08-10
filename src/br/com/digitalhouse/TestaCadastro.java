package br.com.digitalhouse;

public class TestaCadastro {
    public static void main(String[] args) {

        Data dataCliente1 = new Data(10,12,1995);
        Data dataCliente2 = new Data(25,9,1980);


        Cliente cliente1 = new Cliente("Jessica",dataCliente1,101);


        Funcionario funcionario1 = new Funcionario("José",dataCliente2,1500);
        

    }
}
