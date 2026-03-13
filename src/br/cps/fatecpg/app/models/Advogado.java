package br.cps.fatecpg.app.models;

//11. Advogado
//ATRIBUTOS
//-nome
//-idade
//-numero_oab
//-especialidade
//-escritorio
//-casos_ativos 
//MÉTODOS
//-peticionar()
//-defender_cliente()
//-analisar_processo()
//-participar_audiencia()

public class Advogado {
	public String nome;
	public int idade;
	public String numero_oab;
	public String especialidade;
	public String escritorio;
	public String[] casos_ativos;
	
	public void peticionar() {
		System.out.println("Peticionando...");
		System.out.println("Petição realizada com êxito.");
	}
	public void defender_cliente() {
		System.out.println("Realizando defesa...");
		System.out.println("Defesa realizada com êxito.");
	}
	public void analisar_processo() {
		System.out.println("Analisando processo...");
		System.out.println("Processo analisado com êxito.");
	}
	public void participar_audiencia() {
		System.out.println("Participando de audiencia...");
		System.out.println("Audiencia participada com êxito!");
	}
}
