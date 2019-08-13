package br.com.digitalhouse;

public abstract class Pessoa {

    //Attributes
    private String name;
    private Data birth;

    //constructor erase
    public Pessoa() {

    }

    //constructor full
    public Pessoa(String newName, Data newBirth) {
        setName(newName);
        setBirth(newBirth);
    }

    //Abstract method
    public abstract void imprimedados();

    //Getter and Setters
    public String getName() {
        return name;
    }

    public Data getBirth() {
        return birth;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setBirth(Data newBirth) {
        birth = newBirth;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
