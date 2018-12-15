package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Eventos extends JFrame implements ActionListener {

	
	JButton b1 = new JButton("Teste");
	
	JLabel jl = new JLabel();
	
	
	public Eventos(){
		
		
		this.b1.addActionListener(this);

		this.add("West", b1);
		this.add("Center", jl);
		
		this.jl.setToolTipText("Veja seu texto");
		
		this.setBounds(500,500,500,500);
		this.setTitle("Eventos");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JanelaC jlc = new JanelaC();
		
		b1.setText("Nova janela");
		
	}
}
