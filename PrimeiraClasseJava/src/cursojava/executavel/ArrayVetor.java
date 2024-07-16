package cursojava.executavel;

import javax.swing.JOptionPane;


import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogica = {7.1,5.7,8.3,9.0};
		
		
		// Criação do Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Fulano de Tal");
		aluno.setNomeEscola("Super treinamentos");
		
		
		//Criação da Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Beltrano de Souza");
		aluno2.setNomeEscola("Super treinamentos");
		
		
		//Criação da Disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Javascript");
		disciplina3.setNota(notas);
		
		aluno2.getDisciplinas().add(disciplina);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("CSS");
		disciplina4.setNota(notasLogica);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		
		// ------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno é : " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				
				System.out.println("Nome da disciplina : " + d.getDisciplina());
				
				for (int posNota = 0; posNota < d.getNota().length; posNota++) {
					System.out.println("A nota número : " + (posNota + 1) + " é igual = " + d.getNota()[posNota]);
					
				}
			}
			System.out.println("----------------------------------------");
			
		} 
		
		
	}
}
