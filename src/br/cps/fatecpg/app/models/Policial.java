package br.cps.fatecpg.app.models;
//7. Policial
//ATRIBUTOS 
//-nome
//-idade
//-patente
//-arma
//-anos_de_servico
//MÉTODOS
//-prender_suspeito()
//-patrulhar()
//-registrar_ocorrencia()

public class Policial {
    //ATRIBUTOS 
    public String nome;
    public int idade;
    public String patente;
    public String arma;
    public int anos_de_servico;
    //MÉTODOS
    public void prender_suspeito() {
    System.out.println("Realizando prisão...");
    System.out.println("Prisão realizada com sucesso.");
    }
    public void patrulhar() {
    System.out.println("Patrulhando...");
    System.out.println("Patrulha realizada com sucesso.");
    }
    public void registrar_ocorrencia() {
    System.out.println("Registrando ocorrência...");
    System.out.println("Ocorrência registrada com sucesso.");
    }
}
