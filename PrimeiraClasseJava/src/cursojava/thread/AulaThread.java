package cursojava.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		for (int pos = 0; pos < 10; pos++) {
			
			
			Thread.sleep(1000);
			// Quero executar esse envio a com um tempo de parada ou com um tempo determinado 
			System.out.println("Executando alguma rotina, por exemplo um envio de e-mail");
			
		}
		
		System.out.println("Chegou ao final do teste de código Thread");
		
	}
	
}
