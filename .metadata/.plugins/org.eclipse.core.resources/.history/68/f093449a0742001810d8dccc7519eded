package chatsimples; //pacote necessário para a importação ser realizada

import javax.swing.JOptionPane; //

public class Programa{ //início da classa programa

    public static void main(String[] args) { //método principal
        String  ip = (String)JOptionPane.showInputDialog("Informe o IP da maquina destino","192.168.0.105"); //aqui você informa o IP da máquina que dejsa estabelecer comunicação
        int porta = Integer.parseInt(JOptionPane.showInputDialog("Informe a Porta","5000")); //a porta que sera� utilizada

        Conexao c = new Conexao(ip, porta); //cria o objeto de conex�o e passa como parametro a string "ip" e o int "porta"

        JanelaChat j = new JanelaChat(c); //instancia da janela de chat; '
        j.setLocationRelativeTo(null);
        j.setVisible(true); //deixa a tela visivel
    }
}
