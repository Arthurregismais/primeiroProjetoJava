package cursojava.execao;

public class ExcecaoProcessarNota extends Exception{

	public ExcecaoProcessarNota(String erro) {
		super("Vishe, aconteceu um erro no processamento do arquivo ao processar as notas do aluno" + erro);
	}
}
