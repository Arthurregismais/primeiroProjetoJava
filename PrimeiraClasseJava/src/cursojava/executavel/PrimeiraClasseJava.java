package cursojava.executavel;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	/*Main é um metodo auto executavel em Java*/
	 public static void main(String[] args) {
	
		 
		 /*new Aluno() é uma instancia de objeto (criação de objeto)*/
		 
		 
		 /*aluno 1 é uma referência para o objeto aluno*/
		 /*Objeto ainda não existe na memoria*/
		 Aluno aluno1 = new Aluno(); /* Aqui sera o João*/
		 
		 aluno1.setNome("Joao");
		 aluno1.setIdade(23);
		 aluno1.setDataMatricula("29/05/2024");
		 aluno1.setDataNascimento("12/04/2001");
		 aluno1.setNomeEscola("Sinergia");
		 aluno1.setNomeMae("Lucia");
		 aluno1.setNomePai("Frederico");
		 aluno1.setRegistroGeral("30.409.529-1");
		 aluno1.setNumeroCpf("630.010.160-60");
		 aluno1.setSerieMatriculado("Terceirão");
		 aluno1.setNota1(70);
		 aluno1.setNota2(75);
		 aluno1.setNota3(90);
		 aluno1.setNota4(60);
		 
		 System.out.println("O nome do aluno 1 é: " + aluno1.getNome());
		 System.out.println("Sua idade é: " + aluno1.getIdade());
		 System.out.println("Sua data de nascimento é: ");
		 System.out.println("Sua media de notas é: " + aluno1.getMediaNota());
		 System.out.println("E ele foi: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		 System.out.println("E ele foi: " + aluno1.getAlunoAprovado1());
		 
		 
		 /* Agora temos um objeto real*/
		 Aluno aluno2 =  new Aluno(); /*Aqui sera o Pedro*/
		 
		 Aluno aluno3 = new Aluno(); /* Aqui sera o Alex*/
		
		 Aluno aluno4 = new Aluno("Maria");
		 
		 Aluno aluno5 = new Aluno("Jose Madaleno", 23);
		 
		 
		 
	}
	 
 }