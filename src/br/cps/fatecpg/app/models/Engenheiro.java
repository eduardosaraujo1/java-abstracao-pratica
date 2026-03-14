package br.cps.fatecpg.app.models;

//4. Engenheiro
//ATRIBUTOS
//-nome
//-especialidade 
//-rnp
//-projetos_previos
//-nivel_de_graduacao 
//MÉTODOS
//-planejarProjeto()
//-fiscalizarProjeto()
//-emitirLaudoTecnico()

public class Engenheiro {
    //ATRIBUTOS
    public String nome;
    public String especialidade;
    public String rnp;
    public String[] projetos_previos;
    public String nivel_de_graduacao;
    
    //MÉTODOS
    public void planejarProjeto() {
        System.out.println("Planejando projeto...");
        System.out.println("Projeto planejado com sucesso.");
    }
    public void fiscalizarProjeto() {
        System.out.println("Fiscalizando projeto...");
        System.out.println("Projeto fiscalizado com sucesso.");
    }
    public void emitirLaudoTecnico() {
        System.out.println("Emitindo laudo técnico...");
        System.out.println("Laudo emitido com sucesso.");
    }
}
