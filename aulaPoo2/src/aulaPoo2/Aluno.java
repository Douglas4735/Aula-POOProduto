package aulaPoo2;

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
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", mae=" + mae + ", pai=" + pai + "]";
	}
	
	
	
}
