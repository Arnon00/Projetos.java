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

public class TelaEnergia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEnergia frame = new TelaEnergia();
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
	public TelaEnergia() {
		
		setTitle("Desmatamento");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Energia - A Ordem � Economizar !"
				+ "\n\nDepois da revolu��o industrial, no final do s�culo XVIII, e especialmente durante o s�culo XX, o impacto "
				+ "\nda atividade humana sobre o meio ambiente tornou-se muito significativo. O aumento da popula��o"
				+ "\ne do consumo pessoal, principalmente nos pa�ses desenvolvidos, originou problemas ambientais cuja"
				+ "\nsolu��o � o grande desafio deste in�cio de s�culo para pesquisadores, ambientalistas, governos, organiza��es"
				+ "\nn�o-governamentais e comunidades de todo o mundo."
				+ "\n\nGrande parte dos problemas est� relacionada com a explora��o e utiliza��o de energia. Polui��o,"
				+ "chuva �cida, destrui��o da camada de oz�nio, aquecimento da Terra � por causa da intensifica��o do"
				+ "efeito estufa � e destrui��o da fauna e flora s�o alguns dos efeitos dos processos atualmente dispon�veis"
				+ "para a gera��o de energia."
				+ "\n\nA gera��o de energia e o impacto ambiental"
				+ "\n\nExistem v�rios meios de produzir energia el�trica, cada qual com suas vantagens e desvantagens"
				+ "\necon�micas e ambientais. Pode-se produzir eletricidade a partir de fontes renov�veis ou n�o renov�veis."
				+ "\nAs fontes renov�veis s�o aquelas que n�o se esgotam. Algumas delas s�o fontes permanentes e cont�nuas"
				+ "\n - como o Sol, o vento, a �gua e o calor da terra � outras podem se renovar � como a biomassa."
				+ "\n\nAo contr�rio, as fontes de energia n�o renov�veis, como o petr�leo, o carv�o mineral, o g�s natural"
				+ "\ne o ur�nio (usado nas usinas nucleares), tendem a se esgotar. S�o reservas formadas durante milh�es"
				+ "\nde anos a partir da decomposi��o natural de mat�ria org�nica, n�o podendo ser repostas pela a��o do homem."
				+ "\nAs formas mais limpas de produ��o de eletricidade est�o associadas ao uso de fontes de energia renov�veis."
				+ "\n\nA forma��o das bases energ�ticas dos pa�ses sempre resultou de considera��es econ�micas, como"
				+ "\na disponibilidade de recursos naturais e viabilidade de explora��o. No caso do Brasil, por exemplo, a abund�ncia"
				+ "\nde recursos h�dricos foi fundamental para a forma��o de um sistema predominantemente hidr�ulico."
				+ "\n\nNos �ltimos anos, a quest�o ambiental vem ganhando relev�ncia no planejamento energ�tico dos"
				+ "\npa�ses. S� para citar um exemplo, os riscos ambientais levaram a Alemanha a estabelecer um plano"
				+ "\nde desativa��o de todo o seu sistema energ�tico nuclear. A seguir, voc� vai conhecer as principais fontes"
				+ "\nde energia e seus impactos sobre o meio ambiente."
				+ "\n\nO que o consumidor pode fazer"
				+ "\n\nNo seu dia-a-dia, o consumidor dom�stico pode adotar uma s�rie de medidas simples, mas que"
				+ "\nno final do m�s podem se converter numa boa economia de energia. Veja a seguir algumas dicas"
				+ "\npara baixar o consumo:"
				+ "\n\nChuveiro"
				+ "\n\n� O chuveiro el�trico � um dos aparelhos que mais consomem energia. O ideal � evitar seu uso em"
				+ "\nhor�rios de maior consumo (entre 18 h e 20 h; no hor�rio de ver�o, entre 19 h e 20h30)."
				+ "\n\n� Quando o tempo n�o estiver frio, procure usar o chuveiro com a chave na posi��o ver�o (morno)."
				+ "\nO consumo � 30% menor do que na posi��o inverno."
				+ "\n\n� Tente limitar seus banhos em aproximadamente cinco minutos.Feche o chuveiro enquanto se ensaboa."
				+ "\n\nM�quinas de lavar e ferro el�trico"
				+ "\n\n� Se usar m�quinas de lavar lou�as e roupas, ligue-as somente com toda a sua capacidade preenchida."
				+ "\n\n� Habitue-se a juntar a maior quantidade poss�vel de roupas para pass�-las de uma s� vez."
				+ "\n\n� Se o ferro for autom�tico, regule sua temperatura. Passe primeiro as roupas delicadas, que precisam"
				+ "\nde menos calor. No final, depois de deslig�-lo, voc� ainda pode aproveitar o calor para passar"
				+ "\nalgumas roupas leves."
				+ "\n\nGeladeira e freezer"
				+ "\n\n� De forma geral, esses equipamentos s�o respons�veis por cerca de 30% do consumo de uma"
				+ "\nresid�ncia. Na hora de comprar, leve em conta a efici�ncia energ�tica certificada pelo selo Procel"
				+ "\n(Programa Nacional de Conserva��o de Energia El�trica) e d� prefer�ncia aos que utilizam gases"
				+ "\ninofensivos � camada de oz�nio (livres de CFCs)."
				+ "\n\n� Evite a proximidade com o fog�o, aquecedores ou �reas expostas ao sol; No caso de instala��o entre"
				+ "\narm�rios e paredes, deixe um espa�o m�nimo de 15 cm dos lados, acima e no fundo do aparelho."
				+ "\n\n� Evite abrir a porta da geladeira em demasia ou por tempo prolongado."
				+ "\n\n� Deixe espa�o entre os alimentos e guarde-os de forma que voc� possa encontr�-los r�pida e facilmente."
				+ "\n\n� N�o guarde alimentos e/ou l�quidos quentes, nem recipientes sem tampa na geladeira."
				+ "\n\n� N�o forre as prateleiras com vidros ou pl�sticos, pois isso dificulta a circula��o interna de ar."
				+ "\n\n� Fa�a o descongelamento do freezer periodicamente, conforme as instru��es do manual, para evitar"
				+ "\nque se forme uma camada com mais de meio cent�metro de espessura."
				+ "\n\n� No inverno, a temperatura interna do refrigerador n�o precisa ser t�o baixa como no ver�o."
				+ "\n\nRegule o termostato."
				+ "\n� Conserve limpas as serpentinas (as grades) que se encontram na parte de tr�s do aparelho e n�o"
				+ "\nas utilize para secar panos, roupas etc.."
				+ "\n� Quando voc� se ausentar de casa por tempo prolongado, esvazie o freezer e a geladeira"
				+ "\ne deixe-os desligados."
				+ "\n\nL�mpadas"
				+ "\n\n� Na hora de comprar, d� prefer�ncia a l�mpadas fluorescentes, compactas ou circulares, para"
				+ "\na cozinha, �rea de servi�o, garagem e qualquer outro lugar da casa que fique com as luzes acesas por"
				+ "\nmais de quatro horas por dia. Al�m de consumir menos energia, essas l�mpadas duram mais que"
				+ "\nas comuns. N�o se esque�a, por�m, de que essas l�mpadas cont�m subst�ncias qu�micas"
				+ "\nque podem ser prejudiciais � sa�de se n�o forem descartadas adequadamente. O melhor � entregar"
				+ "\nnos locais de venda, quando poss�vel.");
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
