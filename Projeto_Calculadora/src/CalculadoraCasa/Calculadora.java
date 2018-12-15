package CalculadoraCasa;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener, WindowListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String op, acc;
	
	JTextField tf = new JTextField();
	
	JPanel tec = new JPanel();
	
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3= new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bC = new JButton("C");
	JButton bmais = new JButton("+");
	JButton bmenos = new JButton("-");
	JButton bvezes = new JButton("*");
	JButton bdivi = new JButton("/");
	JButton bponto = new JButton(".");

	JButton bigual = new JButton("=");
	
	public void calculadora(){
		
		this.setBounds(150, 150, 300, 350);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("Calculadora");
		
		this.add("Center",tec);
		
		this.add("South", bigual);
		
		tf.setBounds(50,50,50,50);
		this.add("North",tf);
		
		
		this.teclado();
		
		this.setVisible(true);
		
	}
	public void teclado(){
		
		
		tec.setLayout(new GridLayout(4,4));
				
		tec.add(b1);
		b1.addActionListener(this);
		tec.add(b2);
		b2.addActionListener(this);
		tec.add(b3);
		b3.addActionListener(this);
		tec.add(bC);
		
		//******************************************************
		tec.add(b4);
		b4.addActionListener(this);
		tec.add(b5);
		b5.addActionListener(this);
		tec.add(b6);
		b6.addActionListener(this);
		tec.add(bmais);
		
		//******************************************************		
		tec.add(b7);
		b7.addActionListener(this);
		tec.add(b8);
		b8.addActionListener(this);
		tec.add(b9);
		b9.addActionListener(this);
		tec.add(bmenos);
		
		//******************************************************
		tec.add(b0);
		b0.addActionListener(this);
		tec.add(bdivi);
		
		tec.add(bvezes);
		
		tec.add(bponto);
		bponto.addActionListener(this);
		//******************************************************
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object obj = e.getSource();
;

	if(obj.equals(b1)){
		tf.setText(tf.getText()+"1");

//*********************************** Numeros ******************		
	
		}else if (obj.equals(b2)){
			tf.setText(tf.getText()+"2");
		
			}else if (obj.equals(b3)){
				tf.setText(tf.getText()+"3");
			
				}else if (obj.equals(b4)){
					tf.setText(tf.getText()+"4");
				
					}else if (obj.equals(b5)){
						tf.setText(tf.getText()+"5");
					
						}else if (obj.equals(b6)){
							tf.setText(tf.getText()+"6");
						
							}else if (obj.equals(b7)){
								tf.setText(tf.getText()+"7");
							
								}else if (obj.equals(b8)){
									tf.setText(tf.getText()+"8");
								
									}else if (obj.equals(b9)){
										tf.setText(tf.getText()+"9");
									
										}else if (obj.equals(b0)){
											tf.setText(tf.getText()+"0");
										
											}else if (obj.equals(bponto)){
												tf.setText(tf.getText()+".");
												bponto.setEnabled(false);

//*************** Operaçoes ******************************
												
		}else if (obj.equals(bmais)){
			bponto.setEnabled(true);
			
			acc = tf.getText();
			op = "+";

			tf.setText("");
		
			}else if (obj.equals("-")){
			
				
	
				}else if (obj.equals("*")){
			
					
	
					}else if (obj.equals("/")){
			
						
		}
	}
	


}
