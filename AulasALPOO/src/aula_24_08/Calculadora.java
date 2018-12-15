package aula_24_08;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.JFrame;

public class Calculadora extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3828558062216880873L;

	public Calculadora() {
	}
	
// Criando Objeto = teclado;
	JPanel pn = new JPanel();

// Criando Objeto = TextField (Campo de texto); 	
	JTextField fn = new JTextField();

// Criando Objeto = Botões;
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");  
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bmais = new JButton("+");
	JButton bmenos = new JButton("-");
	JButton bvezes = new JButton("*");	
	JButton bdivi = new JButton("/");
	JButton bponto = new JButton(".");
	JButton bC = new JButton("c");
	JButton bigual = new JButton("=");
	
// Criando Metodo = responsavel por abrir a janela;	
	public void janela(){
		
		// setando as dimençoes da janela principal;
		this.setBounds(150,150,300,350);
		this.setTitle("Calculadora");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//fechar no menu...

		
		// setando a posição do Textfild (campo de texto)
		fn.setBounds(50,50,50,50);
		this.add("North",fn);
		
		// setando a posição do teclado na janela principal;
		this.add("Center",pn);
		
		// setando a posição do bota de igual na janela principal; 
		this.add("South",bigual);
		
		// Adicionando o teclado a janela principal;
		this.teclado();
		
		//tornando a janela principal e seus componentes vesiveis;
		this.setVisible(true);
		
	}
	
// Criando Metodo = responsavel pelo teclado;		
	public void teclado(){
		
		// transformando o Lanout de Panel para Grid de 4x4
		
		pn.setLayout(new GridLayout(4, 4));
		
		// Adicionando os botoes na ordem: esquerda > direita de cima > baixo;
		
		pn.add(b1);
		pn.add(b2);
		pn.add(b3);
		pn.add(bC);
		
		pn.add(b4);
		pn.add(b5);
		pn.add(b6);
		pn.add(bmais);
		
		pn.add(b7);
		pn.add(b8);
		pn.add(b9);
		pn.add(bmenos);
		
		pn.add(b0);
		pn.add(bvezes);
		pn.add(bdivi);
		pn.add(bponto);
		
		
	}
}
