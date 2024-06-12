package cursojava.executavel;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	/*Main � um metodo auto executavel em Java*/
	 public static void main(String[] args) {
	
		 
		 /*new Aluno() � uma instancia de objeto (cria��o de objeto)*/
		 
		 
		 /*aluno 1 � uma refer�ncia para o objeto aluno*/
		 /*Objeto ainda n�o existe na memoria*/
		 Aluno aluno1 = new Aluno(); /* Aqui sera o Jo�o*/
		 
		 aluno1.setNome("Joao");
		 aluno1.setIdade(23);
		 aluno1.setDataMatricula("29/05/2024");
		 aluno1.setDataNascimento("12/04/2001");
		 aluno1.setNomeEscola("Sinergia");
		 aluno1.setNomeMae("Lucia");
		 aluno1.setNomePai("Frederico");
		 aluno1.setRegistroGeral("30.409.529-1");
		 aluno1.setNumeroCpf("630.010.160-60");
		 aluno1.setSerieMatriculado("Terceir�o");
		 aluno1.setNota1(70);
		 aluno1.setNota2(75);
		 aluno1.setNota3(90);
		 aluno1.setNota4(60);
		 
		 System.out.println("O nome do aluno 1 �: " + aluno1.getNome());
		 System.out.println("Sua idade �: " + aluno1.getIdade());
		 System.out.println("Sua data de nascimento �: ");
		 System.out.println("Sua media de notas �: " + aluno1.getMediaNota());
		 System.out.println("E ele foi: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		 System.out.println("E ele foi: " + aluno1.getAlunoAprovado1());
		 
		 
		 /* Agora temos um objeto real*/
		 Aluno aluno2 =  new Aluno(); /*Aqui sera o Pedro*/
		 
		 Aluno aluno3 = new Aluno(); /* Aqui sera o Alex*/
		
		 Aluno aluno4 = new Aluno("Maria");
		 
		 Aluno aluno5 = new Aluno("Jose Madaleno", 23);
		 
		 
		 
	}
	 
 }