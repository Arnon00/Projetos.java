package GUI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class Janela extends JFrame{

		JButton b1 = new JButton("Norte");
		JButton b2 = new JButton("Sul");
		JButton b3 = new JButton("centro");
		JButton b4 = new JButton("Leste");
		JButton b5 = new JButton("Oeste");
		
	public Janela(){

		Container c = getContentPane();
		
		c.setLayout(new GridLayout(2,3));
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		
		this.setTitle("Lembrando");
		this.setDefaultCloseOperation(Janela.EXIT_ON_CLOSE);
		this.setBounds(400, 400, 400, 400);
		this.setVisible(true);
		
		
		
		
	}
	
	
}
