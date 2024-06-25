package aulaPoo2;

import javax.swing.JOptionPane;

public class Ex {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String idade = JOptionPane.showInputDialog("digite sua idade");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do paí");
		String comjuge = JOptionPane.showInputDialog("Nome do comjuge");
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setMae(mae);
		aluno1.setPai(pai);
		aluno1.setComjuge(comjuge);
		
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
			
		}
		
		System.out.println(aluno1);
		System.out.println("Media do aluno1 é: "+aluno1.getmediaNota());
		System.out.println("O aluno1 está : " +(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("---------------------------------------");
		
		
	}
	

}
