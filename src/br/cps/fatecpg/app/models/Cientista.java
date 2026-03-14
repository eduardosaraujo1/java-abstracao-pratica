package br.cps.fatecpg.app.models;

//14. Cientista
//ATRIBUTOS
//-nome
//-cpf
//-especialidade
//-patentes
//-manuscritos
//MÉTODOS
//-coletarAmostras()
//-realizarPesquisar()
//-testarHipotese()

public class Cientista {
    public String nome;
    public String cpf;
    public String especialidade;
    public String[] patentes;
    public String[] manuscritos;
    
    public void coletarAmostras() {
        System.out.println("Coletando amostras...");
        System.out.println("Amostras coletadas com sucesso.");
    }

    public void realizarPesquisar() {
        System.out.println("Pesquisando...");
        System.out.println("Pesquisa realizada com sucesso.");
    }

    public void testarHipotese() {
        System.out.println("Testando hipótese...");
        System.out.println("Hipótese testada com sucesso.");
    }

}
