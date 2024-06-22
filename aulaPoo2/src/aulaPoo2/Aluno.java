package aulaPoo2;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String mae;
	private String pai;
	private String comjuge;
	
	String disciplina1; 
	private double nota1;
	
	String disciplina2;
	private double nota2;
	
	String disciplina3;
	private double nota3;
	
	String disciplina4;
	private double nota4;
	
	
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
	
	
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public String getDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public double getmediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
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
				+ ", disciplina1=" + disciplina1 + ", nota1=" + nota1 + ", disciplina2=" + disciplina2 + ", nota2="
				+ nota2 + ", disciplina3=" + disciplina3 + ", nota3=" + nota3 + ", disciplina4=" + disciplina4
				+ ", nota4=" + nota4 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(comjuge, disciplina1, disciplina2, disciplina3, disciplina4, idade, mae, nome, nota1, nota2,
				nota3, nota4, pai);
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
		return Objects.equals(comjuge, other.comjuge) && Objects.equals(disciplina1, other.disciplina1)
				&& Objects.equals(disciplina2, other.disciplina2) && Objects.equals(disciplina3, other.disciplina3)
				&& Objects.equals(disciplina4, other.disciplina4) && idade == other.idade
				&& Objects.equals(mae, other.mae) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4)
				&& Objects.equals(pai, other.pai);
	}

}
