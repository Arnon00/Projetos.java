package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TelaAlimentos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlimentos frame = new TelaAlimentos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAlimentos() {
		
		setTitle("Alimentos");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nComer � um ato agr�cola, disse um fazendeiro e economista americano, "
				+ "mas � tamb�m um ato ecol�gico e um ato pol�tico, por Jaqueline B. Ramos* \n\nQuando "
				+ "falamos em sustentabilidade, pensamos em a��es como n�o poluir, preservar �reas naturais, "
				+ "\nreciclar lixo, economizar �gua, dar prefer�ncia �s fontes alternativas de energia etc. "
				+ "\nMas raramente nos lembramos de relacionar uma de nossas atividades mais b�sicas com impactos "
				+ "\nnegativos no meio ambiente: o ato de se alimentar. Nos prim�rdios da humanidade, a alimenta��o "
				+ "\nera baseada em frutas, ra�zes, carnes de animais ca�ados e outras fontes que n�o modificavam "
				+ "\nsignificativamente a natureza (pelo contr�rio, tudo fazia parte de um ciclo natural). Com o "
				+ "\nadvento da agricultura e da domestica��o de animais, h� cerca de 12 mil anos, deu-se in�cio � "
				+ "\nprodu��o de alimentos. \n\nA passagem do estado n�made para a fixa��o na terra marcou o in�cio do "
				+ "\nque chamamos �desenvolvimento da humanidade�. Com o passar dos s�culos, o homem foi criando "
				+ "\nnovas formas de manejo do solo e as popula��es concentradas nas cidades cresceram em ritmo "
				+ "\nprogressivo, aumentando a demanda por alimentos. At� que a chegada da Era Industrial, no final "
				+ "\ndo s�culo XVIII, intensificou a aglomera��o de pessoas no ambiente urbano, colocando fim, "
				+ "\ndefinitivamente, na liga��o direta que o ser humano tinha com a natureza para a obten��o de "
				+ "\nalimentos. O resultado disso tudo � uma agricultura transformada em ind�stria que passou a "
				+ "\nutilizar m�todos artificiais, como fertilizantes e pesticidas qu�micos, irriga��o, manipula��o "
				+ "\ngen�tica e uso de horm�nios em animais, visando sempre o aumento da produ��o (e o lucro). "
				+ "\nSem contar a depend�ncia por combust�veis f�sseis, inclusive no transporte, por longas dist�ncias, "
				+ "\ndos alimentos. � a cadeia alimentar industrial. \n\nSe por um lado todo esse advento � considerado "
				+ "positivo, sendo denominado \ncomo desenvolvimento ou modernidade, por outro � fato que o modelo de "
				+ "\nalimenta��o industrializado � um forte candidato a causar s�rios danos � conserva��o do meio "
				+ "\nambiente e tamb�m � sa�de do homem. E por incr�vel que pare�a, a maior parte das pessoas atualmente "
				+ "\nn�o se d� conta disso. A origem dos alimentos que consome simplesmente n�o faz parte da sua lista "
				+ "\nde prioridades e a alimenta��o, o ato mais corriqueiro e b�sico do dia-a-dia, n�o � visto sob a "
				+ "\nperspectiva ambiental ou da sustentabilidade."
				+ "\n\nO que o consumidor pode fazer em prol de uma alimenta��o sustent�vel \n\n# Informar-se sobre a import�ncia"
				+ " da agricultura sustent�vel e seus benef�cios para a produ��o de alimentos, inclusive em rela��o � "
				+ "sa�de dos indiv�duos e ambientes. # Apoiar propostas de produ��o regional, especialmente a familiar "
				+ "e a associada, com o objetivo de fortalecer a seguran�a alimentar local e reduzir o desperd�cio de "
				+ "energia no transporte. \n\n# Exigir que os produtores respeitem as leis ambientais, assim como a legisla��o "
				+ "trabalhista, e que utilizem m�todos menos impactantes ao meio ambiente, adquirindo produtos elaborados "
				+ "com este diferencial. \n\n# Demandar que os vendedores de alimentos estimulem a produ��o ecol�gica, inclusive "
				+ "solicitando a certifica��o dos produtores por um organismo independente, para que possa ter certeza de "
				+ "que os mesmos cumprem todas as exig�ncias ambientais. \n\n# Organizar-se em cooperativas de consumo que "
				+ "estimulem a produ��o sustent�vel local e regional.   \n\nFontes: Cartilha Alimentos IDEC, livro �Dilema do "
				+ "On�voro� (editora Intr�nseca) e Sociedade Vegeteriana Brasileira (SVB); Cartilha Alimentos (IDEC); "
				+ "\n\nInformativo do Instituto Ecol�gico Aqualung n. 78 -mar�o/abril 2008. (*) Jaqueline B. Ramos � jornalista "
				+ "e editora do blog Ambiente-se. Este artigo foi publicado originalmente na Ag�ncia Envolverde.");
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		JLabel lblink = new JLabel("Clique aqui para acessar o site que cont�m essas infomra��es.");
		lblink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				URI link = null;
				try {
					link = new URI("http://www.akatu.org.br/Temas/Alimentos/Posts/Os-impactos-da-alimentacao-para-o-meio-ambiente");
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    try {
					Desktop.getDesktop().browse(link);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(lblink, BorderLayout.SOUTH);
	}

}
