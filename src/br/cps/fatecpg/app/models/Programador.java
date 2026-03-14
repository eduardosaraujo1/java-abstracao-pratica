package br.cps.fatecpg.app.models;

//20. Programador
//ATRIBUTOS
//-nome
//-area_atuacao
//-especialidades
//-paradigma_favorito
//-cargo
//MÉTODOS
//-escreverCodigo()
//-desenharFluxograma()
//-debugarCodigo()
//-completarTask()

public class Programador {
    //ATRIBUTOS
    public String nome;
    public String area_atuacao;
    public String especialidades;
    public String paradigma_favorito;
    public String cargo;
    
    //MÉTODOS
    public void escreverCodigo() {
       System.out.println("Escrevendo código...");
       System.out.println("Código escrito com sucesso.");
    }
    public void desenharFluxograma() {
       System.out.println("Desenhando fluxograma...");
       System.out.println("Fluxograma desenhado com sucesso.");
    }
    public void debugarCodigo() {
       System.out.println("Iniciando sessão de debug...");
       System.out.println("Código debugado com sucesso!");
    }
    public void completarTask() {
       System.out.println("Iniciando task...");
       escreverCódigo();
       debugarCódigo();
       System.out.println("Task concluída com sucesso");
    }
}
