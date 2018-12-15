package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class JanelaC extends JFrame {
	
	JButton b1 = new JButton("Ok");
	JButton b2 = new JButton("Cancelar");
	JButton b3 = new JButton("Delete");
	JButton b4 = new JButton("Ajuda");
	
	JTextField jt = new JTextField();
	
	
	public JanelaC(){

		Container c = getContentPane();
		
		Container c2 = new JPanel();
		
		c2.setLayout(new GridLayout(4,1));
		
		c2.add(b1);
		c2.add(b2);
		c2.add(b3);
		c2.add(b4);
		
		c.add("East", c2);
		c.add("Center", jt);
		
		this.setTitle("Janela Composta");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(500,500,500,500);
		this.setVisible(true);
	}
	
	

}
