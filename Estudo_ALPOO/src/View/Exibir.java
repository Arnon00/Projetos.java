package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import model.Pessoa;
import dao.DaoPessoa;

public class Exibir extends JFrame implements ActionListener, WindowListener{
	public Exibir() {
	}

	JPanel botoes = new JPanel();
	JPanel textos = new JPanel();
	JPanel legendas = new JPanel();
	
	JButton b1 = new JButton("Inserir");
	JButton b2 = new JButton("Buscar");
	JButton b3 = new JButton("Apagar");
	JButton b4 = new JButton("Atualizar");
	
	JTextField txt_rg = new JTextField();
	JTextField txt_nome = new JTextField();
	JTextField txt_idade = new JTextField();
	JTextField txt_estado = new JTextField();
	JTextField txt_cidade = new JTextField();
	
	JTextPane leg_rg = new JTextPane();
	JTextPane leg_nome = new JTextPane();
	JTextPane leg_idade = new JTextPane();
	JTextPane leg_estado = new JTextPane();
	JTextPane leg_cidade = new JTextPane();
	
	JPanel Exibi = new JPanel();
	
	Pessoa ps = new Pessoa();
	DaoPessoa dp = new DaoPessoa();
	
	public void exibir(){
		dp.conectar();
		
		this.setBounds(480, 480, 480, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Banco de pessoas");
		this.setVisible(true);
		
		getContentPane().add("South",botoes);
		getContentPane().add("West",textos);
		getContentPane().add("East",legendas);
		this.botoes();
		this.textos();
		this.legendas();
	}
	
	public void botoes(){
		
		botoes.add(b1);
		botoes.add(b2);
		botoes.add(b3);
		botoes.add(b4);
		
		this.setVisible(true);
	}
	
	public void textos(){
		getContentPane().setLayout(new GridLayout(5,1));
		
		dp.buscarTodos();
		textos.add(txt_rg);
		txt_rg.setText(ps.getRg());
		textos.add(txt_nome);
		
		textos.add(txt_idade);
		
		textos.add(txt_estado);
		
		textos.add(txt_cidade);
		
		this.setVisible(true);
		
	}
	
	public void legendas(){
		getContentPane().setLayout(new GridLayout(1,5));
	
		legendas.add(leg_rg); 
		this.leg_rg.setText("RG");
		this.leg_rg.setEditable(false);
		legendas.add(leg_nome);
		this.leg_nome.setText("NOME");
		this.leg_nome.setEditable(false);
		legendas.add(leg_idade);
		this.leg_idade.setText("IDADE");
		this.leg_idade.setEditable(false);
		legendas.add(leg_estado);
		this.leg_estado.setText("ESTADO");
		this.leg_estado.setEditable(false);
		legendas.add(leg_cidade);
		this.leg_cidade.setText("CIDADE");
		this.leg_cidade.setEditable(false);
		
		this.setVisible(true);
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[] args){
		Exibir ex = new Exibir();
		
		ex.exibir();
		
	}
}