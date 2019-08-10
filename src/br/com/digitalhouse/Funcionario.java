package br.com.digitalhouse;

public class Funcionario extends Pessoa {

    //Attributes
    private int salario;

    //Constructor erase
    public Funcionario(){

    }

    public Funcionario(String newName,Data newBirth,int newSalario){
        super.setName(newName);
        super.setBirth(newBirth);
        setSalario(newSalario);

    }

    //methods getters and setters
    public int getSalario(){
        return salario;
    }

    public void setSalario(int newSalario){
        salario=newSalario;
    }

    @Override
    public void imprimedados() {

    }
}
