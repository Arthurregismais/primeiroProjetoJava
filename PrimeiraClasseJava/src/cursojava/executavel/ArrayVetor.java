package cursojava.executavel;

public class ArrayVetor {

	public static void main(String[] args) {
		
		 
		/* Array pode ser de todos os tipos de dados e objetos também */
		
		/*Array sempre deve tre a quantidade de posições definidas*/
		double[] notas = new double[4] ;
		
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 8.9;
		notas[3] = 9.6;
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é " + notas[pos]);
		}
		
		
		
		
	} 
	
}
