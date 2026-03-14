package br.cps.fatecpg.app.models;

//6. Cantor
//ATRIBUTOS
//-nome
//-generos 
//-discografia 
//-instrumentos
//-em_banda
//MÉTODOS
//-gravar()
//-fazerShow()
//-darAutografo()
public class Cantor {
    public String nome;
    public String[] generos;
    public String discografia;
    public String[] instrumentos;
    public boolean em_banda;

    public void gravar() {
        System.out.println("Gravando...");
        System.out.println("Gravação concluida com sucesso.");
    }
    public void fazerShow() {
        System.out.println("Realizando show...");
        System.out.println("Show concluido com sucesso.");
    }
    public void darAutografo() {
        System.out.println("Escrevendo autógrafo...");
        System.out.println("Autógrafo escrito com sucesso.");
    }
}
