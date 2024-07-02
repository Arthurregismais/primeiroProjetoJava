package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;


public class PrimeiraClasseJava {
	
	/*Main � um metodo auto executavel em Java*/
	 public static void main(String[] args) {
	
		 
		 /*new Aluno() � uma instancia de objeto (cria��o de objeto)*/
		 
		 
		 
		 String nome = JOptionPane.showInputDialog("Qual seria o nome do aluno?");
		 String idade = JOptionPane.showInputDialog("Qual seria a idade do aluno?");
		 String dataMatricula = JOptionPane.showInputDialog("Qual seria a data em que foi realizada a matr�cula?");
		 String dataNascimento = JOptionPane.showInputDialog("Qual seria a data de nascimento?");
		 String escola = JOptionPane.showInputDialog("Qual seria o nome da escola?");
		 String nomeMae = JOptionPane.showInputDialog("Qual seria o nome da m�e?");
		 String nomePai = JOptionPane.showInputDialog("Qual seria o nome do pai?");
		 String rg = JOptionPane.showInputDialog("Qual seria o RG?");
		 String cpf = JOptionPane.showInputDialog("Qual seria o CPF?");
		 String serieMatriculado = JOptionPane.showInputDialog("Qual seria a s�rie em que o aluno foi matriculado?");
		 
		 
		 
		 
		 
		 /*aluno 1 � uma refer�ncia para o objeto aluno*/
		 /*Objeto ainda n�o existe na memoria*/
		 
		 
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
		 
		 for (int pos = 1; pos <= 4; pos++ ) {
			 String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+ " ?");
			 String notaDisciplina = JOptionPane.showInputDialog("Nota: "+pos+ " ?");
			 
			 Disciplina disciplina = new Disciplina();
			 disciplina.setDisciplina(nomeDisciplina);
			 disciplina.setNota(Double.valueOf(notaDisciplina));
			 
			 aluno1.getDisciplinas().add(disciplina);
		 }
		 
		 int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		 
		 if (escolha == 0) {
			 String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina, 1, 2, 3 ou 4? ");
			 aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
			 
		 }
		 
		 System.out.println(aluno1.toString());
		 System.out.println("M�dia do aluno: " + aluno1.getMediaNota());
		 System.out.println("E ele foi " + aluno1.getAlunoAprovado1());
		 
		 
		/*
		 Aluno aluno1 = new Aluno();
		 aluno1.setNome("Ciclano");
		 aluno1.setNumeroCpf("123");
		 
		 Aluno aluno2 = new Aluno();
		 aluno2.setNome("Ciclano");
		 aluno2.setNumeroCpf("123");
		 
		 if (aluno1.equals(aluno2)) {
			 System.out.println("Os dois alunos s�o iguais");
		 } else {
			 System.out.println("Os dois alunos n�o s�o iguais");
		 }
		 
		 */
	}    
	
	 
 }