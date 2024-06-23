package aulaPoo2;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String mae;
	private String pai;
	private String comjuge;
	
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getMae() {
		return mae;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getPai() {
		return pai;
	}
	public void setComjuge(String comjuge) {
		this.comjuge = comjuge;
	}
	public String getComjuge() {
		return comjuge;
	}
	
	
	public double getmediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
	}
	public boolean getAlunoAprovado() {
		double media = this.getmediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
		
	}
	public String getAlunoAprovado2() {
		double media = this.getmediaNota();
		
		if(media >= 70) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", mae=" + mae + ", pai=" + pai + ", comjuge=" + comjuge
				+ ", disciplina=" + disciplina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(comjuge, disciplina, idade, mae, nome, pai);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(comjuge, other.comjuge) && Objects.equals(disciplina, other.disciplina)
				&& idade == other.idade && Objects.equals(mae, other.mae) && Objects.equals(nome, other.nome)
				&& Objects.equals(pai, other.pai);
	}
	
	


}
