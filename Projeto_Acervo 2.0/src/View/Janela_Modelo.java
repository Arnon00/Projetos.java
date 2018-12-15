package View;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

	public class Janela_Modelo extends JFrame{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String[] valores = {"ID","TITULO","AUTOR","NUMERO","ANO","EDITORA_ID","QTD_PAG","PRE�O_UNITARIO"};
		public DefaultTableModel modelo = new DefaultTableModel(valores,0);
		private JTable tabela = new JTable(modelo); 
		
		public void init(){
			setSize(300, 200);
			setLocation(300, 200);
			
			JScrollPane lista = new JScrollPane(tabela, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			getContentPane().add(lista, BorderLayout.CENTER);
			setVisible(true);
			}
		}