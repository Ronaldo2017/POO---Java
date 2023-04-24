package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	
	//criando o painel de componentes
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	//executa o que tiver dentro no momento da abertura ou execucao
	public TelaTimeThread() {
		
		//construindo a tela
		setTitle("Tela de time com thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		//controlador dos componentes na tela
		GridBagConstraints bagConstraints = new GridBagConstraints();
		//inicia na primeira linha e coluna
		bagConstraints.gridx = 0;
		bagConstraints.gridy = 0;
		bagConstraints.gridwidth = 2;
		bagConstraints.insets = new Insets(5, 5, 5, 5);
		bagConstraints.anchor = bagConstraints.WEST;
		
		
		//tamnaho do componente na tela
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, bagConstraints);//adiciona o componente no painel
		
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, bagConstraints);
		
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		jPanel.add(descricaoHora2, bagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		bagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, bagConstraints);
		
		
		bagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		bagConstraints.gridy++;
		jPanel.add(jButton, bagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		bagConstraints.gridx++;
		jPanel.add(jButton2, bagConstraints);
		
		add(jPanel, BorderLayout.WEST);
		
		//sempre o ultimo a ser executado
		setVisible(true);//torna a tela visivel ao usuario
	
	}
	
}
