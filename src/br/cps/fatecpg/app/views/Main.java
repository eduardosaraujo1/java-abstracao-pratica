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
		
		advogado.analisarProcesso();
		advogado2.defenderCliente();
		
		// Arquiteto
		Arquiteto arquiteto = new Arquiteto();
		arquiteto.nome = "Carlos Eduardo Martins";
		arquiteto.rnp = "1234567890";
		arquiteto.cau = "A12345-6";
		arquiteto.especialidade = "Arquitetura Sustentável";
		arquiteto.historico_projetos = new String[]{
		    "Projeto Residencial EcoVila - 2022",
		    "Centro Cultural Verde Urbano - 2023"
		};

		Arquiteto arquiteto2 = new Arquiteto();
		arquiteto2.nome = "Fernanda Alves Rocha";
		arquiteto2.rnp = "0987654321";
		arquiteto2.cau = "A54321-0";
		arquiteto2.especialidade = "Urbanismo e Planejamento";
		arquiteto2.historico_projetos = new String[]{
		    "Plano Diretor Bairro Nova Esperança - 2021",
		    "Requalificação da Praça Central - 2024"
		};

		arquiteto.desenharPlanos();
		arquiteto2.definirMateriais();
				
		// Atleta
		Atleta atleta = new Atleta();
		Atleta atleta2 = new Atleta();
		
		atleta.cumprirContrato();
		atleta2.cuidarSaude();
				
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
		Bombeiro bombeiro = new Bombeiro();
	    //public String nome;
	    //public int idade;
	    //public String especialidade;
	    //public int anos_de_servico;
	    //public String quartel_bombeiros;
		Bombeiro bombeiro2 = new Bombeiro();
	    //public String nome;
	    //public int idade;
	    //public String especialidade;
	    //public int anos_de_servico;
	    //public String quartel_bombeiros;
		
		bombeiro.apagarIncendio();
		bombeiro2.dirigirCaminhao();
		
		// Cantor
		Cantor cantor = new Cantor();
	    //public String nome;
	    //public String[] generos;
	    //public String discografia;
	    //public String[] instrumentos;
	    //public boolean em_banda;
		Cantor cantor2 = new Cantor();
	    //public String nome;
	    //public String[] generos;
	    //public String discografia;
	    //public String[] instrumentos;
	    //public boolean em_banda;
		
		cantor.darAutografo();
		cantor2.fazerShow();
		
		// Cientista
		Cientista cientista = new Cientista();
		Cientista cientista2 = new Cientista();
		
		cientista.coletarAmostras();
		cientista2.realizarPesquisar();
		
		// Engenheiro
		Engenheiro engenheiro = new Engenheiro();
		Engenheiro engenheiro2 = new Engenheiro();
		
		engenheiro.fiscalizarProjeto();
		engenheiro2.emitirLaudoTecnico();
		
		// Estudante
		Estudante estudante = new Estudante();
		Estudante estudante2 = new Estudante();
		
		estudante.escrever("Classe: modelo lógico conceitual que representa uma entidade do mundo real.");
		estudante2.conversar();
		
		// Fotografo
		Fotografo fotografo = new Fotografo();
		Fotografo fotografo2 = new Fotografo();
		
		fotografo.calcularOrcamento();
		fotografo2.editarFotos();
		
		// Jornalista
		Jornalista jornalista = new Jornalista();
		Jornalista jornalista2 = new Jornalista();
		
		jornalista.apurarNoticias();
		jornalista2.entrevistarFontes();
		
		// Juiz
		Juiz juiz = new Juiz();
		Juiz juiz2 = new Juiz();
		
		juiz.presidirJulgamento();
		juiz2.analisarProvas();
		
		// Medico
		Medico medico = new Medico();
		Medico medico2 = new Medico();
		
		medico.diagnosticar();
		medico2.requisitarExame();
		
		// Motorista
		Motorista motorista = new Motorista();
		Motorista motorista2 = new Motorista();
		
		motorista.abastecer(16);
		motorista2.estacionar();
		
		// Piloto
		Piloto piloto = new Piloto();
		Piloto piloto2 = new Piloto();
		
		piloto.ajustarRota();
		piloto2.comunicarTorre();
		
		// Pintor
		Pintor pintor = new Pintor();
		Pintor pintor2 = new Pintor();
		
		pintor.pintar();
		pintor2.publicarArte();
		
		// Policial
		Policial policial = new Policial();
		Policial policial2 = new Policial();
		
		policial.prenderSuspeito();
		policial2.patrulhar();
		
		// Politico
		Politico politico = new Politico();
		Politico politico2 = new Politico();
		
		politico.atenderCidadao("Eduardo Soares e Araújo");
		politico2.participarSessao();
		
		// Professor
		Professor professor = new Professor();
		Professor professor2 = new Professor();
		
		professor.prepararAula();
		professor2.prepararProva();
		
		// Programador
		Programador programador = new Programador();
		Programador programador2 = new Programador();
		
		programador.escreverCodigo();
		programador2.completarTask();
		
	}

}
