package aulaPoo2;

import javax.swing.JOptionPane;

public class Ex {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String idade = JOptionPane.showInputDialog("digite sua idade");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do paí");
		String comjuge = JOptionPane.showInputDialog("Nome do comjuge");
		String nota1 = JOptionPane.showInputDialog("nota1");
		String nota2 = JOptionPane.showInputDialog("nota2");
		String nota3 = JOptionPane.showInputDialog("nota3");
		String nota4 = JOptionPane.showInputDialog("nota4");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setMae(mae);
		aluno1.setPai(pai);
		aluno1.setComjuge(comjuge);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		/*
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Fernanda");
		aluno2.setIdade(Integer.valueOf(25));
		aluno2.setMae("Cristiana");
		aluno2.setPai("Marcos");
		aluno2.setComjuge("Douglas");
		aluno2.setNota1(Double.valueOf(90.0));
		aluno2.setNota2(Double.valueOf(90.0));
		aluno2.setNota3(Double.valueOf(80.0));
		aluno2.setNota4(Double.valueOf(70.0));
		*/
		
		System.out.println("Nome do aluno1 é: " + aluno1.getNome());
		System.out.println("Idade do aluno1 é: " + aluno1.getIdade()+" anos.");
		System.out.println("Nome Mãe: " +aluno1.getMae());
		System.out.println("Nome Pai: " +aluno1.getPai());
		System.out.println("Nome do Conjuge: " +aluno1.getComjuge());
		//System.out.println(aluno1);
		System.out.println("Media do aluno1 é: "+aluno1.getmediaNota());
		System.out.println("O aluno1 está : " +(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("---------------------------------------");
		
		/*System.out.println("Nome do aluno2 é: " + aluno2.getNome());
		System.out.println("Idade do aluno2 é: " + aluno2.getIdade()+" anos.");
		System.out.println("Nome Mãe: " +aluno2.getMae());
		System.out.println("Nome Pai: " +aluno2.getPai());*/
		/*System.out.println(aluno2);
		System.out.println("Media do aluno2 é: "+aluno2.getmediaNota());
		System.out.println("O aluno2 está : "+aluno2.getAlunoAprovado2());
		*/
	}
	

}
