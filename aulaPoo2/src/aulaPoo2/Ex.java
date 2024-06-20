package aulaPoo2;

public class Ex {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("douglas da silva soares");
		aluno1.setIdade(Integer.valueOf(33));
		aluno1.setMae("Edina");
		aluno1.setPai("Davi");
		aluno1.setNota1(Double.valueOf(90.0));
		aluno1.setNota2(Double.valueOf(80.0));
		aluno1.setNota3(Double.valueOf(70.0));
		aluno1.setNota4(Double.valueOf(60.0));
		
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Fernanda adriele fernandes de souza soares");
		aluno2.setIdade(Integer.valueOf(25));
		aluno2.setMae("Cristiana");
		aluno2.setPai("Marcos");
		aluno2.setNota1(Double.valueOf(90.0));
		aluno2.setNota2(Double.valueOf(80.0));
		aluno2.setNota3(Double.valueOf(70.0));
		aluno2.setNota4(Double.valueOf(60.0));
		
		
		/*System.out.println("Nome do aluno1 é: " + aluno1.getNome());
		System.out.println("Idade do aluno1 é: " + aluno1.getIdade()+" anos.");
		System.out.println("Nome Mãe: " +aluno1.getMae());
		System.out.println("Nome Pai: " +aluno1.getPai());*/
		System.out.println(aluno1);
		System.out.println("Media do aluno1 é: "+aluno1.getmediaNota());
		System.out.println("---------------------------------------");
		
		/*System.out.println("Nome do aluno2 é: " + aluno2.getNome());
		System.out.println("Idade do aluno2 é: " + aluno2.getIdade()+" anos.");
		System.out.println("Nome Mãe: " +aluno2.getMae());
		System.out.println("Nome Pai: " +aluno2.getPai());*/
		System.out.println(aluno2);
		System.out.println("Media do aluno2 é: "+aluno2.getmediaNota());

	}
	

}
