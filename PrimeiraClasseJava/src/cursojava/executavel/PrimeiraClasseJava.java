package cursojava.executavel;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;


public class PrimeiraClasseJava {
	
	/*Main � um metodo auto executavel em Java*/
	 public static void main(String[] args) {
		 
		 List<Aluno> alunos = new ArrayList<Aluno>();
		 
		 List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		 List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		 List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		 
		 for (int qtd = 1; qtd <=5; qtd++) {
			 
			 /*new Aluno() � uma instancia de objeto (cria��o de objeto)*/
			 
			 
			 
			 String nome = JOptionPane.showInputDialog("Qual seria o nome do aluno " +qtd+ " ?");
			 /*String idade = JOptionPane.showInputDialog("Qual seria a idade do aluno?");
			 String dataMatricula = JOptionPane.showInputDialog("Qual seria a data em que foi realizada a matr�cula?");
			 String dataNascimento = JOptionPane.showInputDialog("Qual seria a data de nascimento?");
			 String escola = JOptionPane.showInputDialog("Qual seria o nome da escola?");
			 String nomeMae = JOptionPane.showInputDialog("Qual seria o nome da m�e?");
			 String nomePai = JOptionPane.showInputDialog("Qual seria o nome do pai?");
			 String rg = JOptionPane.showInputDialog("Qual seria o RG?");
			 String cpf = JOptionPane.showInputDialog("Qual seria o CPF?");
			 String serieMatriculado = JOptionPane.showInputDialog("Qual seria a s�rie em que o aluno foi matriculado?");
			 */
			 
			 
			 
			 
			 /*aluno 1 � uma refer�ncia para o objeto aluno*/
			 /*Objeto ainda n�o existe na memoria*/
			 
			 
			 Aluno aluno1 = new Aluno(); 
			 
			 aluno1.setNome(nome);
			 /*aluno1.setIdade(Integer.valueOf(idade));
			 aluno1.setDataMatricula(dataMatricula);
			 aluno1.setDataNascimento(dataNascimento);
			 aluno1.setNomeEscola(escola);
			 aluno1.setNomeMae(nomeMae);
			 aluno1.setNomePai(nomePai);
			 aluno1.setRegistroGeral(rg);
			 aluno1.setNumeroCpf(cpf);
			 aluno1.setSerieMatriculado(serieMatriculado);
			 */
			 
			 for (int pos = 1; pos <= 4; pos++ ) {
				 String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+ " ?");
				 String notaDisciplina = JOptionPane.showInputDialog("Nota: "+pos+ " ?");
				 
				 Disciplina disciplina = new Disciplina();
				 disciplina.setDisciplina(nomeDisciplina);
				 disciplina.setNota(Double.valueOf(notaDisciplina));
				 
				 aluno1.getDisciplinas().add(disciplina);
			 }
			 
			 int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			 
			 if (escolha == 0) { /* Op��o Sim e ZERO*/
				 
				 int continuarRemover  = 0;
				 int posicao = 1;
				 
				 while (continuarRemover == 0) {
					 String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina, 1, 2, 3 ou 4? ");
					 aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					 posicao++;
					 continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
				 }
				 
			 }
			 
			 alunos.add(aluno1);
			 
		 }
		 
		 for (Aluno aluno : alunos) { /* Separados os alunos em listas */
			 if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				 alunosAprovados.add(aluno); // Aprovados
			 } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				 alunosRecuperacao.add(aluno); // Em recuperacao
			 } else {
				 alunosReprovados.add(aluno); // Reprovados
			 }
			
		}
		
		for (Aluno aluno : alunosAprovados) {
			System.out.println("<----------------------Lista de aprovados---------------------->");
			System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado() + " com media de: " + aluno.getMediaNota());
			
		} 
		
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("<----------------------Lista de alunos em recuperacao---------------------->");
			System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado() + " com media de: " + aluno.getMediaNota());
			
		} 
		
		for (Aluno aluno : alunosReprovados) {
			System.out.println("<----------------------Lista de reprovados---------------------->");
			System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado() + " com media de: " + aluno.getMediaNota());
			
		} 
		 
	}    
	
	 
 }