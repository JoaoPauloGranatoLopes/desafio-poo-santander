package application;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria()
;
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria de java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
	
		System.out.println("+++++++++++++++++");
		Dev dev1 = new Dev();
		dev1.setNome("Camila");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos dev1 " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos dev1: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos concluidos dev1 " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("+++++++++++++++++");
		Dev dev2 = new Dev();
		dev2.setNome("João Paulo");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos dev2 " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos dev2: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos dev2 " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
