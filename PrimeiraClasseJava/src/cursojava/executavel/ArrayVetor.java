package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		 
		/* Array pode ser de todos os tipos de dados e objetos tamb�m */
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter?");
		
		/*Array sempre deve tre a quantidade de posi��es definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o = " + (pos + 1 ));
			notas[pos] = Double.valueOf(valor);
		}
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � " + notas[pos]);
		}
		
		
		
		
	} 
	
}
