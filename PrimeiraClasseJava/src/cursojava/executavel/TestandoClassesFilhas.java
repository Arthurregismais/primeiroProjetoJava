package cursojava.executavel;

import cursojava.classes.*;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Arthur R�gis Mais");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("626362362123");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		
	}
	
}
