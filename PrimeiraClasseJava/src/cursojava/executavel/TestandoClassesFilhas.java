package cursojava.executavel;

import cursojava.classes.*;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Arthur Régis Mais");
		aluno.setIdade(21);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("626362362123");
		diretor.setNome("Fulano");
		diretor.setIdade(60);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("Leonardo");
		secretario.setIdade(23);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário do aluno:  " + aluno.salario());
		System.out.println("Salário do diretor: "+ diretor.salario());
		System.out.println("Salário do secretario: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
			
		}
	public static void teste(Pessoa pessoa) {
		
		System.out.println("Essa pessoa é demais: " 
		+ pessoa.getNome() + " e o salário dela é de: " + pessoa.salario());
		
	}
	
}
