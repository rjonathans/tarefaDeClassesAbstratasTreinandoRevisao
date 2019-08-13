package br.com.digitalhouse;

public class Cliente extends Funcionario{

    //Attributes
    private int id;


    //Constructor Special
    public Cliente(String newName,Data newBirth,float newSalario,int newId){
        super(newName,newBirth,newSalario);
        /*super.setName(newName);
        super.setBirth(newNascto);*/
        setId(newId);

        System.out.println("Olá meu nome é: "+super.getName());
        //sempre que vc quiser acessar os atributos do pai use a palavra reservada "super."
    }

    public int getId(){
        return id;
    }

    public void setId(int newId){
        id=newId;
    }


    @Override
    public void imprimedados() {
        System.out.println(super.getName()+"\n"
                            + super.getBirth().toString()+"\n"
                            + "00"+ getId());

    }
}
