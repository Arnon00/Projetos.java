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

public class TelaLixoEletronico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLixoEletronico frame = new TelaLixoEletronico();
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
	public TelaLixoEletronico() {
		
		setTitle("Lixo Eletronico");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nO lixo tecnol�gico ou eletr�nico possui uma grande quantidade de subst�ncias "
				+ "\nprejudiciais ao ambiente e ao homem. Neste artigo procuro trazer o resultado de \nminhas "
				+ "pesquisas sobre o assunto, incluindo solu��es e dicas do que podemos \nfazer para amenizar o problema."
				+ "\n\nAparentemente estas duas palavras (lixo e tecnologia) n�o tem muito a ver uma com a outra, ou quando "
				+ "tem � no melhor dos sentidos, ou seja, no sentido de algum tipo de tecnologia que trate ou d� destino "
				+ "adequado para o lixo. Por�m estou querendo me referir ao sentido ruim que, juntas, podem formar. O sentido "
				+ "de que a tecnologia que utilizamos todos os dias vira lixo. Porque?"
				+ "\n\nVoc� j� percebeu com que velocidade as tecnologias s�o substitu�das (veja o exemplo dos telefones "
				+ "celulares e computadores"
				+ "\n\nQuando se substitui uma tecnologia, para onde v�o os equipamentos �obsoletos�? (dif�cil de responder "
				+ "\nesta...acho que a maioria para o lixo n�o �?)."
				+ "\nEst� ai o motivo porque estas palavras andam juntas em seu pior sentido. Em nosso dia a dia n�o pensamos "
				+ "\nnisto, n�o pensamos o quanto uma bateria de celular ou de notebook v�o poluir o solo ou os len��is fre�ticos "
				+ "\n(e muitas vezes nem sabemos que poluem), ou mesmo os demais componentes como pl�stico e metais pesados. Nossa "
				+ "\npreocupa��o est� geralmente em nos manter dentro da �onda�, da tecnologia."
				+ "\n\n**Mas o que n�s podemos fazer, afinal"
				+ "\n**Esta � a pergunta chave, o que podemos fazer?"
				+ "\n\nBom, ela envolve muitas iniciativas e vai al�m do listado abaixo, mas vou citar algumas que acredito serem relevantes:"
				+ "\n\nPare de se render ao apelo do mercado: Trocar de celular ou de computador todo ano (a n�o ser que seja estritamente necess�rio para o seu trabalho) n�o faz o menor sentido se ele estiver funcionando e servindo �s suas necessidades! Voc� evita gastar dinheiro e evita poluir o meio ambiente;"
				+ "\n\nSeu computador est� muito lento? Compre um novo mas doe o seu antigo para uma pessoa que precisa dele, um amigo, uma institui��o etc;"
				+ "\n\nEstenda a vida �til de seus equipamentos. No caso dos computadores, por exemplo, muitas vezes a lentid�o se deve aos arquivos perdidos e �lixo� deixado pelo sistema operacional. Os v�rus tamb�m podem deixar seu computador lento. Uma solu��o seria fazer um backup de seus arquivos e depois formatar o computador, reinstalando novamente o sistema operacional. Passar um anti-v�rus antes de formatar a m�quina pode resolver o problema sem a necessidade da formata��o;"
				+ "\n\nVoc� tamb�m pode utilizar sites de troca para fazer aquele chamado �rolo�;"
				+ "\n\nVenda seu computador ou as pe�as separadamente (no caso de desktops pode-se vender separadamente a CPU, o monitor, teclado, mouse, caixas de som ou mesmo as pe�as individualmente, caso voc� tenha algum conhecimento em hardware), que seja por um pre�o m�nimo, mas que algu�m possa reaproveita-lo. Sites de leil�o tamb�m pode ser uma boa;"
				+ "\n\nBateria: Nokia, Gradiente, Siemens e Motorola t�m urnas em todas as lojas das operadoras e oficinas autorizadas para o descarte das baterias . O Banco Real tamb�m recebe pilas e baterias usadas em suas ag�ncias banc�rias;"
				+ "\n\nMuitas empresas fabricantes de eletr�nicos e operadoras de celular j� recebem de volta os aparelhos usados. Ligue para a sua operadora e se informe ou mesmo na loja em que adquirir seu novo equipamento;"
				+ "\n\nUtilize como crit�rio de compra, al�m do pre�o, a responsabilidade que a empresa assume com o meio ambiente.");
				
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JLabel link = new JLabel("Clique aqui para acessar o site que cont�m essas informa��es.");
		link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				URI link = null;
				try {
					link = new URI("http://www.sermelhor.com.br/ecologia/lixo-eletronico-problema-e-solucoes.html");
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
