package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo do envio de emails
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
			
		
		/****************************************************************** Divisão das threads */
		
		// Thread processando em paralelo do envio de notas fiscais
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		
		//Código do sistema do usuário, continua o fluxo de trabalho
		System.out.println("Chegou ao final do teste de código Thread");
		// Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal, algo do tipo
		JOptionPane.showMessageDialog(null, "O sistema continua executando para o usuário");
		
		
	}
	
	private static Runnable thread1 = new Runnable() {
		public void run() {
			// Executa o que nós queremos
			
			// Código da rotina
			for (int pos = 0; pos < 10; pos++) {
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				// Quero executar esse envio a com um tempo de parada ou com um tempo determinado 
				System.out.println("Executando alguma rotina, por exemplo um envio de e-mail");
				
			}
			// Fim do código em paralelo 
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		public void run() {
			// Executa o que nós queremos
			
			// Código da rotina
			for (int pos = 0; pos < 10; pos++) {
				
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				// Quero executar esse envio a com um tempo de parada ou com um tempo determinado 
				System.out.println("Executando alguma rotina, por exemplo um envio de nota fiscal");
				
			}
			// Fim do código em paralelo
		}
	};
	
}
