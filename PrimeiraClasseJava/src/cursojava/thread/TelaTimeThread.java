package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	
	public TelaTimeThread() { // Executa o que tiver dentro no momento da abertura ou da execu��o
		setTitle("Minha tela de time com thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		// Primeira parte concluida
		
		
		
		
		// Sempre ser� o �ltimo a ser executado
		setVisible(true); // Torna a tela vis�vel para o usu�rio 
	}
	
}
