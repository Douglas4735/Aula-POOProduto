package aulaPoo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String mae;
	private String pai;
	private String comjuge;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
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
		
		 double somaNotas = 0.0;
		 for(Disciplina disciplina : disciplinas) {
			 somaNotas += disciplina.getNota();
		 }
		 return somaNotas / disciplinas.size();
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
				+ ", disciplinas=" + disciplinas + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(comjuge, disciplinas, idade, mae, nome, pai);
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
		return Objects.equals(comjuge, other.comjuge) && Objects.equals(disciplinas, other.disciplinas)
				&& idade == other.idade && Objects.equals(mae, other.mae) && Objects.equals(nome, other.nome)
				&& Objects.equals(pai, other.pai);
	}
	


}
