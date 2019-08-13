package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private  int qtdAtual;
    private Pessoa pessoa;
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa novaPessoa){
        pessoas.add(novaPessoa);
    }

    public void imprimeCadastro(){
        for (int i=0;i<pessoas.size();i++){
            System.out.println(pessoas.get(i).toString());
        }
    }



}
