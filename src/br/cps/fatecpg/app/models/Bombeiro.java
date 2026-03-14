package br.cps.fatecpg.app.models;
//8. Bombeiro
//ATRIBUTOS
//-nome
//-idade
//-especialidade
//-anos_de_servico
//-quartel_bombeiros
//MÉTODOS
//-apagar_incendio()
//-resgatar_vitima()
//-dirigir_caminhao()

public class Bombeiro {
    //ATRIBUTOS
    public String nome;
    public int idade;
    public String especialidade;
    public int anos_de_servico;
    public String quartel_bombeiros;
    //MÉTODOS
    public void apagar_incendio() {
        System.out.println("Apagando incendio...");
        System.out.println("Incendio apagado com sucesso.");
    }
    public void resgatar_vitima() {
        System.out.println("Resgatando vitima...");
        System.out.println("Vitima resgatada com sucesso.");
    }
    public void dirigir_caminhao() {
        System.out.println("Dirigindo caminhão...");
            System.out.println("Caminhão dirigido com sucesso.");
    }
}
