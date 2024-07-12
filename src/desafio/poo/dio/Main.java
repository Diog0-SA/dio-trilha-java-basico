package desafio.poo.dio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();   // Curso 1
		
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargoHoraria(8);
		
		//System.out.println(curso1);
		
		Curso curso2 = new Curso();   // Curso 2
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargoHoraria(4);
		
		//System.out.println(curso2);
		
		/*Conteudo conteudo = new Curso(); Exemplo de poliformismo
		 *Conteudo conteudo = new Mentoria();
		 *
		 *Não se pode instanciar Conteudo pq é abstract
		 */
		
		Mentoria mentoria = new Mentoria();   // Mentoria
		
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos[Camila]: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("---");
		System.out.println("Conteúdos Concluidos[Camila]: " + devCamila.getConteudosConcluidos());
		System.out.println("Conteúdos Inscritos[Camila]: " + devCamila.getConteudosInscritos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos[João]: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("---");
		System.out.println("Conteúdos Concluidos[João]: " + devJoao.getConteudosConcluidos());
		System.out.println("Conteúdos Inscritos[João]: " + devJoao.getConteudosInscritos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}
}
