package aulaPoo2;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String mae;
	private String pai;
	
	private double nota1;
	private double nota2;
	private double nota3;
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
		return "Aluno [nome=" + nome + ", idade=" + idade + ", mae=" + mae + ", pai=" + pai + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idade, mae, nome, nota1, nota2, nota3, nota4, pai);
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
		return idade == other.idade && Objects.equals(mae, other.mae) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4)
				&& Objects.equals(pai, other.pai);
	}
	
	
	
	
}
