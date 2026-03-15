package br.cps.fatecpg.app.models;
//12. Juiz
//ATRIBUTOS
//-nome
//-idade 
//-comarca 
//-anos_de_magistratura
//-status_tribunal 
//MÉTODOS
//-proferir_sentenca()
//-assinar_despacho()
//-presidir_julgamento()
//-analisar_provas()

public class Juiz {
    //ATRIBUTOS
    public String nome;
    public int idade;
    public String comarca;
    public int anos_de_magistratura;
    public String status_tribunal;
    //MÉTODOS
    public void proferirSentenca(){
        System.out.println("Proferindo sentença...");
        System.out.println("Sentença proferida com sucesso.");
    }
    public void assinarDespacho() {
        System.out.println("Assinando despacho...");
        System.out.println("Despacho assinado com sucesso.");

    }
    public void presidirJulgamento() {
        System.out.println("Presidindo julgamento...");
        System.out.println("Julgamento presidido com sucesso.");
    }
    public void analisarProvas() {
        System.out.println("Analisando provas...");
        System.out.println("Provas avaliadas com sucesso.");
    }
}
