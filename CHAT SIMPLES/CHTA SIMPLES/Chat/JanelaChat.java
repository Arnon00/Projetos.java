package chatsimples; //pacote importado com as configuraÃ§Ãµes do chat
//imports necessÃ¡rios para criaÃ§Ã£o da janela.
import java.awt.event.KeyEvent;  //awt para habilitar os eventos da janela.
import java.util.Observable; //padrÃ£o observÃ¡vel do projeto
import java.util.Observer; //traz o padrÃ£o observador ao cÃ³digo.
import java.util.Map;
import java.util.regex.Pattern;
import java.util.HashMap;
public class JanelaChat extends javax.swing.JFrame implements Observer { //classe estende os componentes Swing e implementa o padrÃ£o observer.

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Conexao conexao; //cria o atributo conexÃ£o.

    public JanelaChat(Conexao conexao) { //cria a janela de chat e chama a conexÃ£o.
        super("Chat"); //super classe do chat
        this.conexao = conexao; //chama o atributo conexÃ£o
        initComponents(); //inicializa os componentes.
        conexao.addObserver(this); //a conexÃ£o implementa o padrÃ£o observer
        escreve("Chat iniciado com " + conexao.getIp() + ":" + conexao.getPorta()); //chat iniciado com  + pega o nÃºmero de ip e a porta de quem comeÃ§ou a conversa.
        mensagemjTextArea.requestFocusInWindow(); //foca o cursor na parte que Ã© possÃ­vel digitar a mensagem.
    }

    private void envia() { //mÃ©todo para enviar mensagens
        if (!mensagemjTextArea.getText().isEmpty()) { //confirma se a caixa de texto nÃ£o estÃ¡ vazia.
            conexao.envia(mensagemjTextArea.getText()); //entÃ£o captura o texto, o envia a mensagem
            escreve("Voce disse: "+mensagemjTextArea.getText()); //vocÃª disse + pega o texto que estÃ¡ na caixa de mensagem.
            mensagemjTextArea.setText(""); //pega o texto da caixa de mensagem.
        }
    }

    private void escreve(String texto){ //metodo para escrever mensagem.
        chatjTextArea.append(texto+"\n"); //organiza a mensagem e concatena com o texto.
         if (!chatjTextArea.getText().isEmpty() && !chatjTextArea.isFocusOwner()) { //confirma se a caixa de texto estÃ¡ vazia r foca na caixa de texto.
                chatjTextArea.setCaretPosition(chatjTextArea.getText().length() - 1); //vai andando o cursor ate ler toda a mensagem.
            }

    }



    private void initComponents() { //mÃ©todo para inicializar os componenetes e formar a janela.

        jScrollPane1 = new javax.swing.JScrollPane(); //painel
        chatjTextArea = new javax.swing.JTextArea(); //caixa de texto
        jScrollPane2 = new javax.swing.JScrollPane();//segundo painel
        mensagemjTextArea = new javax.swing.JTextArea(); //caixa de texto
        enviarjButton = new javax.swing.JButton(); //botÃ£o para enivar mensagem

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //fecha ajanela do chat

        chatjTextArea.setEditable(false); //nÃ£o permite a ediÃ§Ã£o do formulÃ¡rio
        chatjTextArea.setColumns(20); //colunas da janela
        chatjTextArea.setRows(5); //linhas da janela
        jScrollPane1.setViewportView(chatjTextArea); //qual Ã¡rea serÃ¡ apresentada

        mensagemjTextArea.setColumns(20);//colunas da Ã¡rea da mensagem
        mensagemjTextArea.setRows(5); //linhas da Ã¡rea de mensagem
        mensagemjTextArea.addKeyListener(new java.awt.event.KeyAdapter() { //key listener -: Utilizado para â€œouvirâ€� eventos que sÃ£o disparados pelo pressionamento, liberaÃ§Ã£o ou digitaÃ§Ã£o de uma tecla qualquer, em resumo: O uso do teclado.
            public void keyReleased(java.awt.event.KeyEvent evt) { //percepÃ§Ã£o dos eventos
                mensagemjTextAreaKeyReleased(evt); //evento para let o que contÃ©m na caixa de texto
            }
        });
        jScrollPane2.setViewportView(mensagemjTextArea); //segundo painel

        enviarjButton.setText("Enviar"); //botÃ£o de envio
        enviarjButton.addActionListener(new java.awt.event.ActionListener() { // ativa o action listener do botÃ£o
            public void actionPerformed(java.awt.event.ActionEvent evt) { // responsÃ¡vel por tomar alguma aÃ§Ã£o caso algum evento ocorra.
                enviarjButtonActionPerformed(evt); //configura o botÃ£o com o poder de ser actionPerformed
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); //configura o tipo de layout da ajanela
        getContentPane().setLayout(layout); //obtÃ©m o Layout
        layout.setHorizontalGroup( //configura o layout horizontal.
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //cria um alinhamento paralelo.
            .addComponent(jScrollPane1) //adiciona o componente.
            .addGroup(layout.createSequentialGroup() //cria um layout sequencial.
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE) //adiciona mais um componente
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)) //adiciona o botÃ£o enviar
        );
        layout.setVerticalGroup(  //configura o grupo vertical
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //cria um grupo paralelo.
            .addGroup(layout.createSequentialGroup() //adiciona esse grupo de forma sequencial.
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE) //configura o tamanho
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) //configura o layout.
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) //cria grupo paralelo.
                    .addComponent(jScrollPane2) //adiciona o componente
                    .addComponent(enviarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) //adiciona o botÃ£o
                .addGap(0, 0, Short.MAX_VALUE)) //configura a posiÃ§Ã£o.
        );

        pack();
    }

    private void enviarjButtonActionPerformed(java.awt.event.ActionEvent evt) { //metodo para configurar o botão enviar
        envia(); //chamar o método envia para realizar isso
    }

    private void mensagemjTextAreaKeyReleased(java.awt.event.KeyEvent evt) { //metodo para controlar a caixa de "mensagem"
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            envia(); //novamente o metodo envia que vai controlar esta ação
        }
    }

    //atributos encapsulados
    private javax.swing.JTextArea chatjTextArea; //a area de texto para as mensagens serem aprsentadas
    private javax.swing.JButton enviarjButton; //o botão enviar
    private javax.swing.JScrollPane jScrollPane1; //primeiro painel
    private javax.swing.JScrollPane jScrollPane2; //segundo painel
    private javax.swing.JTextArea mensagemjTextArea; //a area de texto para as mensagens escritas pelo usuario serem apresentadas

//metodo para realizar a atualização do envio e recebimento das mensagens
    public void update(Observable o, Object arg) { //método sem retorno
        escreve(conexao.getMensagem()); //captura as mensagens
    }
}
private ReplacementsMap() {
	super();
	put(":-)", 0x1F60A);
	put(":)", 0x1F60A);
	put(":-(", 0x1F61E);
	put(":(", 0x1F61E);
	put(":-D", 0x1F603);
	put(":D", 0x1F603);
	put(";-)", 0x1F609);
	put(";)", 0x1F609);
	put(":-P", 0x1F61C);
	put(":P", 0x1F61C);
	put(":-p", 0x1F61C);
	put(":p", 0x1F61C);
	put(":-*", 0x1F618);
	put(":*", 0x1F618);
	put("<3", 0x2764);
	put(":3", 0x2764);
	put(">:[", 0x1F621);
	put(":'|", 0x1F625);
	put(":-[", 0x1F629);
	put(":'(", 0x1F62D);
	put("=O", 0x1F631);
	put("xD", 0x1F601);
	put(":')", 0x1F602);
	put(":-/", 0x1F612);
	put(":/", 0x1F612);
	put(":-|", 0x1F614);
	put(":|", 0x1F614);
	put("*_*", 0x1F60D);
}

public static ReplacementsMap getInstance() {
	if (mInstance == null) {
		mInstance = new ReplacementsMap();
	}
	return mInstance;
}

}
