package cursojava.executavel;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;


public class PrimeiraClasseJava {
	
	/*Main é um metodo auto executavel em Java*/
	 public static void main(String[] args) {
		 
		 List<Aluno> alunos = new ArrayList<Aluno>();
		 
		 for (int qtd = 1; qtd <=2; qtd++) {
			 
			 /*new Aluno() é uma instancia de objeto (criação de objeto)*/
			 
			 
			 
			 String nome = JOptionPane.showInputDialog("Qual seria o nome do aluno " +qtd+ " ?");
			 /*String idade = JOptionPane.showInputDialog("Qual seria a idade do aluno?");
			 String dataMatricula = JOptionPane.showInputDialog("Qual seria a data em que foi realizada a matrícula?");
			 String dataNascimento = JOptionPane.showInputDialog("Qual seria a data de nascimento?");
			 String escola = JOptionPane.showInputDialog("Qual seria o nome da escola?");
			 String nomeMae = JOptionPane.showInputDialog("Qual seria o nome da mãe?");
			 String nomePai = JOptionPane.showInputDialog("Qual seria o nome do pai?");
			 String rg = JOptionPane.showInputDialog("Qual seria o RG?");
			 String cpf = JOptionPane.showInputDialog("Qual seria o CPF?");
			 String serieMatriculado = JOptionPane.showInputDialog("Qual seria a série em que o aluno foi matriculado?");
			 */
			 
			 
			 
			 
			 /*aluno 1 é uma referência para o objeto aluno*/
			 /*Objeto ainda não existe na memoria*/
			 
			 
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
			 
			 if (escolha == 0) { /* Opção Sim e ZERO*/
				 
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
	
		 for (int pos = 0; pos < alunos.size(); pos++) {
			 
			 Aluno aluno = alunos.get(pos);
			 
			 System.out.println("Aluno = " + aluno.getNome());
			 System.out.println("Média do aluno =  " + aluno.getMediaNota());
			 System.out.println("Resultado = " + aluno.getAlunoAprovado());
			 System.out.println("-----------------------------------------");
			 
			 for (int posDisciplina = 0; posDisciplina < aluno.getDisciplinas().size(); posDisciplina++ ) {
				 Disciplina disc = aluno.getDisciplinas().get(posDisciplina);
				 System.out.println("Materia = " + disc.getDisciplina() + " Nota + " + disc.getNota());
			 }
		 }
		 
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