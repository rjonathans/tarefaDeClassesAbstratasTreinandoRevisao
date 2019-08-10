package br.com.digitalhouse;

public class Cliente extends Pessoa{

    //Attributes
    private int id;

    //Constructor erase
    public Cliente(){

    }

    //Constructor Special
    public Cliente(String newName,Data newNascto,int newId){
        super.setName(newName);
        super.setBirth(newNascto);
        setId(newId);
    }

    public int getId(){
        return id;
    }

    public void setId(int newId){
        id=newId;
    }


    @Override
    public void imprimedados() {

    }
}
