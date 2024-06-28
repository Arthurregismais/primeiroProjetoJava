package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	/*Main é um metodo auto executavel em Java*/
	 public static void main(String[] args) {
	
		 
		 /*new Aluno() é uma instancia de objeto (criação de objeto)*/
		 
		 
		 
		 String nome = JOptionPane.showInputDialog("Qual seria o nome do aluno?");
		 String idade = JOptionPane.showInputDialog("Qual seria a idade do aluno?");
		 String dataMatricula = JOptionPane.showInputDialog("Qual seria a data em que foi realizada a matrícula?");
		 String dataNascimento = JOptionPane.showInputDialog("Qual seria a data de nascimento?");
		 String escola = JOptionPane.showInputDialog("Qual seria o nome da escola?");
		 String nomeMae = JOptionPane.showInputDialog("Qual seria o nome da mãe?");
		 String nomePai = JOptionPane.showInputDialog("Qual seria o nome do pai?");
		 String rg = JOptionPane.showInputDialog("Qual seria o RG?");
		 String cpf = JOptionPane.showInputDialog("Qual seria o CPF?");
		 String serieMatriculado = JOptionPane.showInputDialog("Qual seria a série em que o aluno foi matriculado?");
		 
		 String disciplina1 = JOptionPane.showInputDialog("Qual foi a primeira disciplina?");
		 String nota1 = JOptionPane.showInputDialog("Qual foi a primeira nota?");
		 String disciplina2 = JOptionPane.showInputDialog("Qual foi a segunda disciplina?");
		 String nota2 = JOptionPane.showInputDialog("Qual foi a segunda nota?");
		 String disciplina3 = JOptionPane.showInputDialog("Qual foi a terceira disciplina?");
		 String nota3 = JOptionPane.showInputDialog("Qual foi a terceira nota?");
		 String disciplina4 = JOptionPane.showInputDialog("Qual foi a quarta disciplina?");
		 String nota4 = JOptionPane.showInputDialog("Qual foi a quarta nota?");
		 
		 
		 
		 
		 
		 /*aluno 1 é uma referência para o objeto aluno*/
		 /*Objeto ainda não existe na memoria*/
		 
		 
		 Aluno aluno1 = new Aluno(); 
		 
		 aluno1.setNome(nome);
		 aluno1.setIdade(Integer.valueOf(idade));
		 aluno1.setDataMatricula(dataMatricula);
		 aluno1.setDataNascimento(dataNascimento);
		 aluno1.setNomeEscola(escola);
		 aluno1.setNomeMae(nomeMae);
		 aluno1.setNomePai(nomePai);
		 aluno1.setRegistroGeral(rg);
		 aluno1.setNumeroCpf(cpf);
		 aluno1.setSerieMatriculado(serieMatriculado);
		 
		 
		 
		 System.out.println(aluno1.toString());
		 System.out.println("Média do aluno: " + aluno1.getMediaNota());
		 System.out.println("E ele foi " + aluno1.getAlunoAprovado1());
		 
		 
		/*
		 Aluno aluno1 = new Aluno();
		 aluno1.setNome("Ciclano");
		 aluno1.setNumeroCpf("123");
		 
		 Aluno aluno2 = new Aluno();
		 aluno2.setNome("Ciclano");
		 aluno2.setNumeroCpf("123");
		 
		 if (aluno1.equals(aluno2)) {
			 System.out.println("Os dois alunos são iguais");
		 } else {
			 System.out.println("Os dois alunos não são iguais");
		 }
		 
		 */
	}    
	
	 
 }