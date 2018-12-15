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

public class TelaAgua extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAgua frame = new TelaAgua();
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
	public TelaAgua() {
		
		setTitle("�gua");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Agua. Um recurso cada vez mais amea�ado !"
				+ "\n\nA �gua � um recurso natural essencial para a sobreviv�ncia de todas as esp�cies que habitam a Terra."
				+ "\nNo organismo humano a �gua atua, entre outras fun��es, como ve�culo para a troca de subst�ncias e para"
				+ "\na manuten��o da temperatura, representando cerca de 70% de sua massa corporal. Al�m disso, � considerada"
				+ "\nsolvente universal e � uma das poucas subst�ncias que encontramos nos tr�s estados f�sicos: gasoso,"
				+ "\nl�quido e s�lido. � imposs�vel imaginar como seria o nosso dia-a-dia sem ela."
				+ "\n\nOs alimentos que ingerimos dependem diretamente da �gua para a sua produ��o. Necessitamos"
				+ "\nda �gua tamb�m para a higiene pessoal, para lavar roupas e utens�lios e para a manuten��o da limpeza"
				+ "\nde nossas habita��es. Ela � essencial na produ��o de energia el�trica, na limpeza das cidades, na constru��o"
				+ "\nde obras, no combate a inc�ndios e na irriga��o de jardins, entre outros. As ind�strias utilizam grandes"
				+ "\nquantidades de �gua, seja como mat�ria-prima, seja na remo��o de impurezas, na gera��o de vapor"
				+ "\ne na refrigera��o. Dentre todas as nossas atividades, por�m, � a agricultura aquela que mais consome �gua �"
				+ "\ncerca de 70% de toda a �gua consumida no planeta � utilizada pela irriga��o (veja o quadro)."
				+ "\n\nA amea�a da falta de �gua, em n�veis que podem at� mesmo inviabilizar a nossa exist�ncia, pode"
				+ "\nparecer exagero, mas n�o �. Os efeitos na qualidade e na quantidade da �gua dispon�vel, relacionados"
				+ "\ncom o r�pido crescimento da popula��o mundial e com a concentra��o dessa popula��o em megal�poles,"
				+ "\nj� s�o evidentes em v�rias partes do mundo. Dados do Fundo das Na��es Unidas para a Inf�ncia (Unicef )"
				+ "\ne da Organiza��o Mundial da Sa�de (OMS) revelam que quase metade da popula��o mundial (2,6 bilh�es"
				+ "\nde pessoas) n�o conta com servi�o de saneamento b�sico e que uma em cada seis pessoas (cerca de1,1 bilh�o"
				+ "\nde pessoas) ainda n�o possui sistema de abastecimento de �gua adequado. As proje��es da Organiza��o das Na��es "
				+ "\nUnidas indicam que, se a tend�ncia continuar, em 2050 mais de 45% da popula��o"
				+ "\nmundial estar� vivendo em pa�ses que n�o poder�o garantir a cota di�ria m�nima de 50 litros de"
				+ "\n�gua por pessoa. Com base nestes dados, em 2000, os 189 pa�ses membros da ONU assumiram como uma"
				+ "\ndas metas de desenvolvimento do mil�nio reduzir � metade a quantidade de pessoas que n�o t�m acesso"
				+ "\n� �gua pot�vel e saneamento b�sico at� 2015."
				+ "\n\nMesmo pa�ses que disp�em de recursos h�dricos abundantes, como o Brasil, n�o est�o livres da"
				+ "\namea�a de uma crise. A disponibilidade varia muito de uma regi�o para outra. Al�m disso, nossas reservas"
				+ "\nde �gua pot�vel est�o diminuindo. Entre as principais causas da diminui��o da �gua pot�vel est�o"
				+ "\no crescente aumento do consumo, o desperd�cio e a polui��o das �guas superficiais e subterr�neas por"
				+ "\nesgotos dom�sticos e res�duos t�xicos provenientes da ind�stria e da agricultura."
				+ "\nNeste cap�tulo do Manual de Educa��o para o Consumo Sustent�vel se discute porque � t�o importante"
				+ "\ne inadi�vel a conserva��o dos recursos h�dricos do planeta e quais as a��es necess�rias para garantir o seu"
				+ "\nconsumo sustent�vel. A partir das informa��es contidas neste manual, voc� vai poder mostrar aos seus"
				+ "\nalunos que, com pequenas mudan�as de h�bitos, todos podemos contribuir para conservar nossas �guas,"
				+ "\naprendendo a controlar a polui��o e a consumir sem desperd�cio."
				+ "\n\nO que pode ser feito"
				+ "\n\nA��es voltadas para a redu��o do desperd�cio e para o controle da polui��o da �gua."
				+ "\n\n1. Para reduzir o desperd�cio de �gua:"
				+ "\n\n� Diminuir o desperd�cio de �gua na produ��o agr�cola e industrial, a partir do controle dos volumes"
				+ "\nde �gua utilizados nos processos industriais, da introdu��o de t�cnicas de reuso de �gua e da utiliza��o"
				+ "\nde equipamentos e m�todos de irriga��o poupadores de �gua;"
				+ "\n\n� Reduzir o consumo dom�stico de �gua a partir da incorpora��o do conceito de consumo sustent�vel"
				+ "\nde �gua no nosso dia-a dia. Para tanto, � necess�rio que cada um de n�s promova mudan�as"
				+ "\nde h�bitos (bastante arraigados e bastante conhecidos por todos), envolvendo, por exemplo, o tempo"
				+ "\nnecess�rio para tomar banho, o costume de escovar os dentes com a torneira aberta, o uso de"
				+ "\nmangueira para lavar casas e carros etc.."
				+ "\n\n� Reduzir o desperd�cio de �gua tratada nos sistemas de abastecimento de �gua, recuperando"
				+ "\nos sistemas antigos e introduzindo medidas de manejo que tornem os sistemas mais eficientes;"
				+ "\n\n2. Para reduzir a polui��o decorrente das atividades agr�colas:"
				+ "\n\n� reduzir o uso de agrot�xicos e fertilizantes na agricultura;"
				+ "\n\n� Implantar medidas de controle de eros�o de solos e de redu��o dos processos de assoreamento"
				+ "\nde corpos de �gua, tanto em n�vel urbano como rural."
				+ "\n\n3. Para reduzir a polui��o das �guas:"
				+ "\n\n� Apoiar iniciativas que visem a implanta��o de sistemas de tratamento de esgotos, como forma"
				+ "\nde reduzir a contamina��o da �gua;"
				+ "\n\n� Exigir que o munic�pio fa�a o tratamento adequado dos res�duos. Propor, por exemplo, a instala��o"
				+ "\nde sistemas de coleta seletiva e reciclagem de res�duos s�lidos; aterros sanit�rios, esta��es de"
				+ "\nrecebimento de produtos t�xicos agr�colas e domiciliares, tais como restos de tinta, solventes,"
				+ "\npetr�leo, embalagem de agrot�xicos, entre outros;"
				+ "\n\n� Organizar-se. Os consumidores organizados podem pressionar as empresas para que produzam"
				+ "\ndetergentes, produtos de limpeza, embalagens etc. que causem menores impactos ambientais."
				+ "\n\nFonte da informa��o: Clique no bot�o direito do mouse para acessar o site");
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		JLabel link = new JLabel("Clique para acessar o site que cont�m essas informa��es.");
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
