package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	/*Main é um metodo auto executavel em Java*/
	 public static void main(String[] args) {
	
		 
		 /*new Aluno() é uma instancia de objeto (criação de objeto)*/
		 
		 String nome = JOptionPane.showInputDialog("Qual seria o nome do aluno?");
		 String idade = JOptionPane.showInputDialog("Qual seria a idade do aluno?");
		 String dataMatricula = JOptionPane.showInputDialog("Qual seria a data de matrículao?");
		 String dataNascimento = JOptionPane.showInputDialog("Qual seria a data de nascimento?");
		 String escola = JOptionPane.showInputDialog("Qual seria o nome da escola?");
		 String nomeMae = JOptionPane.showInputDialog("Qual seria o nome da mãe?");
		 String nomePai = JOptionPane.showInputDialog("Qual seria o nome do pai?");
		 String rg = JOptionPane.showInputDialog("Qual seria o RG?");
		 String cpf = JOptionPane.showInputDialog("Qual seria o CPF?");
		 String serieMatriculado = JOptionPane.showInputDialog("Qual seria a série em que o aluno foi matriculado?");
		 String nota1 = JOptionPane.showInputDialog("Qual foi a primeira nota?");
		 String nota2 = JOptionPane.showInputDialog("Qual foi a segunda nota?");
		 String nota3 = JOptionPane.showInputDialog("Qual foi a terceira nota?");
		 String nota4 = JOptionPane.showInputDialog("Qual foi a quarta nota?");
		 
		 
		 /*aluno 1 é uma referência para o objeto aluno*/
		 /*Objeto ainda não existe na memoria*/
		 Aluno aluno1 = new Aluno(); /* Aqui sera o João*/
		 
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
		 aluno1.setNota1(Double.parseDouble(nota1));
		 aluno1.setNota2(Double.parseDouble(nota2));
		 aluno1.setNota3(Double.parseDouble(nota3));
		 aluno1.setNota4(Double.parseDouble(nota4));
		 
		 System.out.println("O nome do aluno 1 é: " + aluno1.getNome());
		 System.out.println("Sua idade é: " + aluno1.getIdade());
		 System.out.println("Sua data de nascimento é: ");
		 System.out.println("Sua media de notas é: " + aluno1.getMediaNota());
		 System.out.println("E ele foi: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		 System.out.println("E ele foi: " + aluno1.getAlunoAprovado1());
		 
		 
		 
		 
	}
	 
 }