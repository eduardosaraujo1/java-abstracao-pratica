package br.cps.fatecpg.app.models;
/*2. Estudante
ATRIBUTOS
-nome
-instutuicao_ensino
-turma
-materia_preferida
-data_nascimento
MÉTODOS
-assistirAula()
-escrever()
-conversar()
-estudarLivro()*/
public class Estudante {
    //ATRIBUTOS
    public String nome;
    public String instutuicao_ensino;
    public String turma;
    public String materia_preferida;
    public String data_nascimento; // formato 'yyyy-mm-dd'
    //MÉTODOS
    public void assistirAula(){
        System.out.println("Assistindo aula...");
        System.out.println("Aula assistida com sucesso.");
    }
    public void escrever(String anotacao){

        System.out.println("Escrevendo '"+anotacao+"'...");
        System.out.println("'"+anotacao+"' escrito com sucesso");
    }
    public void conversar(){
        System.out.println("Conversando...");
        System.out.println("Conversa concluida com sucesso.");
    }
    public void estudarLivro(){
        System.out.println("Lendo livro...");
        System.out.println("Livro lido com sucesso.");
    }
}
