package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButtonStart = new JButton("Start");
	private JButton jButtonStop = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		@Override
		public void run() {
			while (true) { // Vai ficar sempre rodando até eu matar a thread
				mostraTempo.setText(new SimpleDateFormat("dd//MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;

	
	public TelaTimeThread() { // Executa o que tiver dentro no momento da abertura ou da execução
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		// Primeira parte concluida
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets( 5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		/* < ------------------------------------- Botões -----------------------------------------------> */
		jButtonStart.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButtonStart, gridBagConstraints);
		
		jButtonStart.addActionListener(new ActionListener() { // Executa clicando no botão Start
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
			}
		} );
		
		jButtonStop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButtonStop, gridBagConstraints);
		
		jButtonStop.addActionListener(new ActionListener() { // Executa clicando no botão Stop
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				
			}
		});
		
		
		add(jPanel, BorderLayout.WEST);
		// Sempre será o último a ser executado
		setVisible(true); // Torna a tela visível para o usuário 
	}
	
}
