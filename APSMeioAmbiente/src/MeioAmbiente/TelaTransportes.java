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

public class TelaTransportes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTransportes frame = new TelaTransportes();
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
	public TelaTransportes() {
		
		setTitle("Desmatamento");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nOs Trasportes."
				+ "\n\nOs meios de transporte t�m um papel fundamental em nossa sociedade. Direta ou indiretamente,"
				+ "\ndependemos deles para a maioria de nossas atividades cotidianas. Sem os transportes, como chegar�amos ao"
				+ "\ntrabalho ou � escola? Como as hortali�as chegariam do campo � cidade? Como poder�amos transportar"
				+ "\nas mercadorias das f�bricas?"
				+ "\n\nO problema � que boa parte dos transportes que utilizamos atualmente se move a partir da queima"
				+ "\nde combust�veis f�sseis, como a gasolina e o �leo diesel, lan�ando grandes quantidades de gases t�xicos"
				+ "\nna atmosfera. Autom�veis, �nibus, caminh�es e outros ve�culos motorizados s�o hoje a principal causa"
				+ "\nde polui��o do ar na maioria das cidades do mundo."
				+ "\n\nA situa��o � preocupante. Embora v�rios pa�ses tenham adotado medidas para baixar os �ndices"
				+ "\nde polui��o, como a regulagem de motores, redu��o de subst�ncias t�xicas nos combust�veis e at� rod�zios"
				+ "\nde autom�veis, a contamina��o do ar ainda representa uma s�ria amea�a. Al�m dos danos ambientais"
				+ "\nglobais, como aumento do efeito estufa, diariamente muitas pessoas em todo o planeta est�o adoecendo"
				+ "\ne at� morrendo por causa da polui��o do ar. Isso sem falar nos efeitos para os animais e at� para as plantas."
				+ "\n\nReverter esse quadro � um desafio que deve envolver toda a sociedade: se n�o podemos abrir"
				+ "\nm�o de algo t�o necess�rio como os meios de transporte resta-nos tratar de encontrar formas"
				+ "\nde us�-los sem que prejudiquem nem a n�s mesmos nem �s gera��es futuras. Isto � o que chamamos"
				+ "\nde um transporte sustent�vel."
				+ "\n\nPolui��o veicular: um problema global e local"
				+ "\n\nEm todo o mundo, as megacidades com mais de 10 milh�es de habitantes enfrentam s�rios problemas"
				+ "\ncausados pela polui��o veicular. Ao contr�rio do que se poderia supor, a polui��o n�o � mais grave"
				+ "\nnos pa�ses mais ricos e desenvolvidos. Atualmente, grandes metr�poles como Paris, Nova York, Londres"
				+ "\ne T�quio s�o menos polu�das do que muitas cidades de pa�ses em desenvolvimento, como a Cidade"
				+ "\ndo M�xico, Buenos Aires e S�o Paulo. Nesse ranking, os pa�ses pobres levam desvantagem, pois carecem"
				+ "\nde investimentos em transporte coletivo e outras medidas capazes de melhorar a qualidade do ar."
				+ "\n\nNo Brasil, os paulistanos s�o os que mais sofrem com a polui��o do ar. S�o Paulo tem sido apontada"
				+ "\ncomo a quinta cidade mais polu�da do planeta. Em 2003, segundo dados da Companhia de Tecnologia de"
				+ "\nSaneamento Ambiental (Cetesb), �rg�o respons�vel pelo monitoramento da qualidade do ar no Estado,"
				+ "\na regi�o metropolitana possu�a uma frota de 7,5 milh�es de ve�culos e cerca de 2 mil ind�strias. Estima-se"
				+ "\nque essas fontes de polui��o s�o respons�veis pelas emiss�es para a atmosfera de: 1,8 milh�es de t/ano"
				+ "\nde CO, 415mil t/ano de HC, 409 mil t/ano de NOx, 67 mil t/ano de MP e 37 mil t/ano de SOx. Desses totais,"
				+ "\nos ve�culos s�o respons�veis por 98% das emiss�es de CO, 97% de HC, 97% de NOx, 52% de MP e 55%"
				+ "\nde SOx. Da frota que circula na regi�o metropolitana de S�o Paulo, 5,8% dos ve�culos s�o movidos a �leo"
				+ "\ndiesel (cerca de 400 mil ve�culos, entre �nibus, caminh�es e caminhonetes) e despejam anualmente 12,4 mil"
				+ "\ntoneladas de fuma�a preta na atmosfera, colocando em risco o meio ambiente e a sa�de da popula��o.");
		contentPane.add(textArea, BorderLayout.CENTER);
		
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
