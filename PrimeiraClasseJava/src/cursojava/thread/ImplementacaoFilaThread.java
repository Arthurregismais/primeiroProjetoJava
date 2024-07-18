package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = 
				new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	
	@Override
	public void run() {
		Iterator iteracao = pilha_filha.iterator();
		
		synchronized (iteracao) { // Bloquear o acesso a esta lista por outros processos
			
			while (iteracao.hasNext()) { // Enquanto conter dados na lista ele ir� processar
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //  Pega o objeto atual
				
				// Processar 10 mil notas fiscais
				// Gerar uma lista enorme de pdf
				// Gerar um envio em massa de e-mail
				System.out.println("---------------");
				
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(100); // Dar um tempo pra descarga de mem�ria
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			try {
				Thread.sleep(1000); // Processou toda a lista d� um tempo pra limpeza de mem�ria
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
