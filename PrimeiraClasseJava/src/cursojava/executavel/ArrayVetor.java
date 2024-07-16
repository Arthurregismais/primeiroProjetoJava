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
		
		System.out.println("----------Disciplina do Aluno-----------");
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			double notaMenor = 0.0;
			
			for (int pos = 0; pos < d.getNota().length; pos++) {
				if (pos == 0) {
					notaMenor = d.getNota()[pos];
				} else {
					if (d.getNota()[pos] < notaMenor) {
						notaMenor = d.getNota()[pos];
					}
				}
				System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
			}
			System.out.println("A menor nota da Disciplina = " + d.getDisciplina() + " e de valor : " + notaMenor);
		}
	} 
	
}
