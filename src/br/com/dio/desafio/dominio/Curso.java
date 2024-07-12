package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + cargaHoraria;
	}
	
	public Curso() {
		
	}
	
	public int getCargoHoraria() {
		return cargaHoraria;
	}
	public void setCargoHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String toString() {
		return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao=" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
	}

}
