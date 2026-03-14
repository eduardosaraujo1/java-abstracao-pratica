package br.cps.fatecpg.app.models;

//17. JORNALISTA 
//ATRIBUTOS
//-nome
//-idade 
//-area_atuação 
//-anos_experiencia
//-veiculo
//-cargo
//-email
//-telefone
//MÉTODOS
//-apurarNoticias()
//-entrevistarFontes() 
//-escreverMateria()
//-revisarTexto()
//-publicarMaterias()

public class Jornalista {
    //ATRIBUTOS
    public String nome;
    public int idade;
    public String area_atuacao;
    public int anos_experiencia;
    public String veiculo;
    public String cargo;
    public String email;
    public String telefone;
    //MÉTODOS
    public void apurarNoticias(){
       System.out.println("Apurando noticias...");
       System.out.println("Noticias apuradas com êxito.");
    }
    public void entrevistarFontes() {
       System.out.println("Entrevistando fonte...");
       System.out.println("Fontes entrevistadas com êxito.");
    }
    public void escreverMateria(){
       System.out.println("Escrevendo matéria...");
       System.out.println("Matéria escrita com êxito.");
    }
    public void revisarTexto(){
       System.out.println("Revisando texto...");
       System.out.println("Texto revisado com êxito.");
    }
    public void publicarMaterias(){
       System.out.println("Publicando matérias...");
       System.out.println("Matérias publicadas com êxito.");
    }

}
