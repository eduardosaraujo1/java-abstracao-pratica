package br.cps.fatecpg.app.views;
import br.cps.fatecpg.app.models.*;

public class Main {

	public static void main(String[] args) {
		// Advogado
		Advogado advogado = new Advogado();
		advogado.casos_ativos = new String[]{"Processo contra Google Monopólio"};
		advogado.escritorio = "Avenida ABC, 32";
		advogado.especialidade = "Advogado do estado";
		advogado.idade = 32;
		advogado.nome = "Clóvis";
		advogado.numero_oab = "OAB/SP 123456";
		Advogado advogado2 = new Advogado();
		advogado2.casos_ativos = new String[]{"Defesa Google Monopólio"};
		advogado.escritorio = "Avenida DEF, 64";
		advogado.especialidade = "Advogado Particular Google";
		advogado.idade = 50;
		advogado.nome = "Antônio";
		advogado.numero_oab = "OAB/SP 987654";
		
		advogado.analisar_processo();
		advogado2.defender_cliente();
		// Arquiteto
				
		// Atleta
				
		// Ator
		Ator ator = new Ator();
		ator.drt = "93212367312";
		ator.idade = 26;
		ator.idiomas_fluentes = new String[]{"Inglês", "Francês"};
		ator.papeis_previos = new String[] {"Hamlet", "O selvagem"};
		
		Ator ator2 = new Ator();
		ator.drt = "82101256201";
		ator.idade = 60;
		ator.idiomas_fluentes = new String[]{"Inglês", "Português"};
		ator.papeis_previos = new String[] {"Platão", "Socrates"};
		
		ator.chorar();
		ator2.falar("Do not go gentle into that good night.");
		// Bombeiro
		
		// Cantor
		
		// Cientista
		
		// Engenheiro
		
		// Estudante
		
		// Fotografo
		
		// Jornalista
		
		// Juiz
		
		// Medico
		
		// Motorista
		
		// Piloto
		
		// Pintor
		
		// Policial
		
		// Politico
		
		// Professor
		
		// Programador
		
	}

}
