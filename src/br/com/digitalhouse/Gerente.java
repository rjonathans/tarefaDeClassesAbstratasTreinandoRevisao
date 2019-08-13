package br.com.digitalhouse;

import java.util.Objects;

public class Gerente extends Funcionario{

    private String area;


    public Gerente(String newName,Data newBirth,float newSalario,String newArea) {
        super(newName,newBirth,newSalario);
        area=newArea;
    }

    @Override
    public float calcularImposto() {
        float calImposto = (float) (getSalario()*0.05);
        return calImposto;
    }

    @Override
    public void imprimedados() {
        super.imprimedados();
        float salarioComImposto = super.getSalario()- calcularImposto();
        System.out.println(salarioComImposto+"\n");


    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "area='" + area + '\'' +
                '}';
    }
}
