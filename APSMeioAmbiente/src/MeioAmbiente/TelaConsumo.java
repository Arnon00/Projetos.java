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

public class TelaConsumo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsumo frame = new TelaConsumo();
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
	public TelaConsumo() {
		
		setTitle("Consumo Verde");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nConsumo verde"
				+ "\n\nConsumo verde � aquele em que o consumidor, al�m de buscar melhor qualidade e pre�o, inclui em"
				+ "\nseu poder de escolha, a vari�vel ambiental, dando prefer�ncia a produtos e servi�os que n�o agridam"
				+ "\no meio ambiente, tanto na produ��o, quanto na distribui��o, no consumo e no descarte final."
				+ "\n\nEsta estrat�gia tem alguns benef�cios importantes, como o fato de os cidad�os comuns sentirem,"
				+ "\nna pr�tica, que podem ajudar a reduzir os problemas ambientais. Al�m disso, os consumidores verdes"
				+ "\nsentem-se parte de um grupo crescente de pessoas preocupadas com o impacto ambiental de suas escolhas."
				+ "\nMas a estrat�gia de consumo verde tem algumas limita��es. Os consumidores s�o estimulados"
				+ "\na trocar uma marca X por uma marca Y, para que os produtores percebam que suas escolhas mudaram."
				+ "\n\nA possibilidade de escolha, portanto, acabou se resumindo a diferentes marcas e n�o entre consumismo"
				+ "\ne n�o-consumismo. Muitas empresas passaram a se interessar em mapear o poder de compra de"
				+ "\npessoas com alto poder aquisitivo interessadas em um estilo de vida de baixo impacto ambiental,"
				+ "\npercebendo-as como um novo nicho de mercado. Assim, a necessidade de redu��o e modifica��o"
				+ "\ndos padr�es de consumo foi substitu�da pelo simples �esverdeamento� dos produtos e servi�os."
				+ "\nAl�m disso, o consumo verde atacaria somente uma parte do problema � a tecnologia � enfatizando"
				+ "\no desenvolvimento de produtos verdes para uma parcela da sociedade, enquanto os pobres ficam"
				+ "\ncom produtos inferiores e com um n�vel de consumo abaixo da satisfa��o de suas necessidades"
				+ "\nb�sicas. O tema da desigualdade no acesso aos bens ambientais desapareceu completamente dos"
				+ "\ndebates e propostas de consumo verde . ");
		getContentPane().add(textArea, BorderLayout.CENTER);
		
	    JLabel link = new JLabel("Clique aqui para acessar o site que cont�m essas informa��es.");
		link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
					URI link = null;
					try {
						link = new URI("http://portal.mec.gov.br/dmdocuments/publicacao8.pdf");
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
		contentPane.add(link, BorderLayout.SOUTH);
	}

}
