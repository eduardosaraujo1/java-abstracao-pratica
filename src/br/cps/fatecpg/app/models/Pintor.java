package br.cps.fatecpg.app.models;

//15. Pintor
//ATRIBUTOS
//-nome
//-cpf
//-especialidade
//-projetos
//-formacao
//MÉTODOS
//-desenhar()
//-pintar()
//-publicarArte()

public class Pintor {
    //ATRIBUTOS
    public String nome;
    public String cpf;
    public String especialidade;
    public String[] projetos;
    public String formacao;
    //MÉTODOS
    public void desenhar() {
       System.out.println("Desenhando...");
       System.out.println("Desenho concluído com sucesso.");
    }
    public void pintar() {
       System.out.println("Pintando...");
       System.out.println("Pintura concluída com sucesso.");
    }
    public void publicarArte() {
       System.out.println("Publicando arte...");
       System.out.println("Arte publicada com sucesso.");
    }
}
