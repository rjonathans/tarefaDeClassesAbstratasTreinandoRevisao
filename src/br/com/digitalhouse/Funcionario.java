package br.com.digitalhouse;

public class Funcionario extends Pessoa implements Imposto {

    //Attributes
    private float salario;
    private float porcentagem;


    public Funcionario(String newName,Data newBirth,float newSalario){
        super(newName,newBirth);
        setSalario(newSalario);
    }

    //methods getters and setters
    public float getSalario(){
        return salario;
    }

    public void setSalario(float newSalario){
        salario=newSalario;
    }

    public float calcularImposto() {
        float calImposto = (float) (salario*0.03);
        return calImposto;
        // isto é um cast, onde você força o resulta para o que vc quer que aqui seria um float

    }

    @Override
    public void imprimedados() {
        float salarioComImposto = salario - calcularImposto();
        System.out.println(getName()+"\n"
                +getBirth().toString()
                +"\n"+getSalario()+"\n"
                + salarioComImposto+"\n");

    }


}
