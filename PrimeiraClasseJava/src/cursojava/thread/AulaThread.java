package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo do envio de emails
		new Thread() {
			
			public void run() { // Executa o que n�s queremos
				
				// C�digo da rotina
				for (int pos = 0; pos < 10; pos++) {
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					// Quero executar esse envio a com um tempo de parada ou com um tempo determinado 
					System.out.println("Executando alguma rotina, por exemplo um envio de e-mail");
					
				}
				// Fim do c�digo em paralelo
			}; 
			
		}.start();
		
		/****************************************************************** Divis�o das threads */
		
		// Thread processando em paralelo do envio de notas fiscais
		new Thread() {
			
			public void run() { // Executa o que n�s queremos
				
				// C�digo da rotina
				for (int pos = 0; pos < 10; pos++) {
					
					
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					// Quero executar esse envio a com um tempo de parada ou com um tempo determinado 
					System.out.println("Executando alguma rotina, por exemplo um envio de nota fiscal");
					
				}
				// Fim do c�digo em paralelo
			}; 
			
		}.start();
		
		
		
		//C�digo do sistema do usu�rio, continua o fluxo de trabalho
		System.out.println("Chegou ao final do teste de c�digo Thread");
		// Fluxo do sistema, cadastro de venda, uma emiss�o de nota fiscal, algo do tipo
		JOptionPane.showMessageDialog(null, "O sistema continua executando para o usu�rio");
		
		
	}
	
}
