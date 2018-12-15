package neverCalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;

public class Inicial extends Influenciaveis {

	private JFrame frame;
	private JTextField sai_chance_critico;
	private JTextField ent_Crit;
	private JButton btnCalcular;
	private JTextField ent_power;
	private JTextField sai_poder;
	private JTextField Sai_Severidade_critica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial window = new Inicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicial() {
		initialize();
	}

		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 744, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setHorizontalAlignment(SwingConstants.LEFT);
		btnCalcular.setBounds(25, 45, 89, 23);
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setCrit((Integer.parseInt(ent_Crit.getText())));
				sai_chance_critico.setText(String.valueOf(ccrit())); 
				
				setPw((Integer.parseInt(ent_power.getText())));
				sai_poder.setText(String.valueOf((getPw())));  
			}
		});
		frame.getContentPane().add(btnCalcular);
		
		sai_chance_critico = new JTextField();
		sai_chance_critico.setBounds(293, 184, 86, 20);
		frame.getContentPane().add(sai_chance_critico);
		sai_chance_critico.setColumns(10);
		
		ent_Crit = new JTextField();
		ent_Crit.setBounds(25, 184, 86, 20);
		ent_Crit.setText("");
		frame.getContentPane().add(ent_Crit);
		ent_Crit.setColumns(10);
		
		JFormattedTextField frmtdtxtfldGolpeCritco = new JFormattedTextField();
		frmtdtxtfldGolpeCritco.setEnabled(false);
		frmtdtxtfldGolpeCritco.setEditable(false);
		frmtdtxtfldGolpeCritco.setText("Golpe Crit\u00EDco");
		frmtdtxtfldGolpeCritco.setBounds(25, 165, 82, 20);
		frame.getContentPane().add(frmtdtxtfldGolpeCritco);
		
		JFormattedTextField frmtdtxtfldChanceCritca = new JFormattedTextField();
		frmtdtxtfldChanceCritca.setEnabled(false);
		frmtdtxtfldChanceCritca.setEditable(false);
		frmtdtxtfldChanceCritca.setText("Chance Crit\u00EDca");
		frmtdtxtfldChanceCritca.setBounds(293, 165, 82, 20);
		frame.getContentPane().add(frmtdtxtfldChanceCritca);
		
		JFormattedTextField frmtdtxtfldPoder = new JFormattedTextField();
		frmtdtxtfldPoder.setEnabled(false);
		frmtdtxtfldPoder.setEditable(false);
		frmtdtxtfldPoder.setText("Poder");
		frmtdtxtfldPoder.setBounds(25, 110, 82, 20);
		frame.getContentPane().add(frmtdtxtfldPoder);
		
		ent_power = new JTextField();
		ent_power.setBounds(25, 130, 86, 20);
		frame.getContentPane().add(ent_power);
		ent_power.setColumns(10);
		
		sai_poder = new JTextField();
		sai_poder.setBounds(293, 130, 86, 20);
		frame.getContentPane().add(sai_poder);
		sai_poder.setColumns(10);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("Poder");
		formattedTextField.setEnabled(false);
		formattedTextField.setEditable(false);
		formattedTextField.setBounds(293, 110, 82, 20);
		frame.getContentPane().add(formattedTextField);
		
		Sai_Severidade_critica = new JTextField();
		Sai_Severidade_critica.setBounds(293, 243, 86, 20);
		frame.getContentPane().add(Sai_Severidade_critica);
		Sai_Severidade_critica.setColumns(10);
		

	}
}
