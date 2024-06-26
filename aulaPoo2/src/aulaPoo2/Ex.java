package aulaPoo2;

import javax.swing.JOptionPane;

public class Ex {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		/*String idade = JOptionPane.showInputDialog("digite sua idade");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do paí");
		String comjuge = JOptionPane.showInputDialog("Nome do comjuge");*/
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setMae(mae);
		aluno1.setPai(pai);
		aluno1.setComjuge(comjuge);*/
		
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina");
			
			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina(nomeDisciplina);
			disciplina1.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina1);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma Disciplina?");
		
		if(escolha == 0){
			String removerDisciplina = JOptionPane.showInputDialog("Qual a disciplina a ser removida 1, 2, 3, ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - 1);
		}
		
		System.out.println(aluno1);
		System.out.println("Media do aluno1 é: "+aluno1.getmediaNota());
		System.out.println("O aluno1 está : " +(aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("---------------------------------------");
		
		
	}
	

}
