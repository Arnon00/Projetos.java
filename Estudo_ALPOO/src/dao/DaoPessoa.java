package dao;


import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.Vector;    

import javax.swing.JOptionPane;  



import model.Pessoa;  
import dao.banco.ConFactory;
  
public class DaoPessoa {
	
	private final String url = "jdbc:mysql://localhost/javafx_crud", nome = "root", senha = ""; 
	
	private Connection con;
	private Statement comando;
	
	
	public void apagar(String rg){
		conectar();
		try{
			comando
				.executeUpdate("DELETE FROM pessoa WHERE rg = '" + rg + "';");
		}catch (SQLException e){
			System.out.printf("Erro na exclusão de pessoa... ", e.getMessage());
			System.out.println("Algo deu errado na hora de apagar.");
		} finally {
			fechar();
		}
	}
	public Vector<Pessoa> buscarTodos(){
		conectar();
		Vector<Pessoa> resultados = new Vector<Pessoa>();
		ResultSet rs;
		try{
			rs = comando.executeQuery("SELECT * FROM pessoa");
			while (rs.next()){
				Pessoa temp = new Pessoa();
				temp.setRg(rs.getString("rg"));
				temp.setNome(rs.getString("nome"));
				temp.setIdade(rs.getInt("idade"));
				temp.setCidade(rs.getString("cidade"));
				temp.setEstado(rs.getString("estado"));
				resultados.add(temp);
				System.out.println("RG: "+temp.getRg()+", Nome: "+temp.getNome()+", Idade: "+temp.getIdade()+", Cidade: "+temp.getCidade()+", Estado: "+temp.getEstado()+".");
			}
			return resultados;
		}catch(SQLException e){
			imprimeErro("Algo deu errado na Obtenção das informaçoes.", e.getMessage());
			return null;
		} finally{
			fechar();
		}
	}
	public void atualizar(Pessoa pessoa){
		conectar();
		String com = "UPDATE pessoa SET nome ='"+pessoa.getNome()+"', idade ="+pessoa.getIdade()+",cidade='"+pessoa.getCidade()+"', estado='"+pessoa.getEstado()+"' WHERE rg = '"+pessoa.getRg()+"';";
		System.out.println("Atualizada!.");
		try{
			comando.executeQuery(com);
		}catch(SQLException e){
			imprimeErro("erro ao atualizar.", e.getMessage());
		}finally{
			fechar();
		}
	}
	public Vector <Pessoa> buscar (String rg){
		conectar();
		
		Vector<Pessoa> resultados = new Vector<Pessoa>();
		  ResultSet rs;    
		  try {           
			  rs = comando.executeQuery("SELECT * FROM pessoa WHERE rg LIKE '"+rg+"%';");          
			  while (rs.next()) {              
				  Pessoa temp = new Pessoa();                        
				  temp.setRg(rs.getString("rg"));              
				  temp.setNome(rs.getString("nome"));              
				  temp.setIdade(rs.getInt("idade"));              
				  temp.setCidade(rs.getString("cidade"));              
				  temp.setEstado(rs.getString("estado"));              
				  resultados.add(temp);           
				  }           
			  return resultados;        
			  } catch (SQLException e){          
				  imprimeErro("Erro ao buscar pessoa", e.getMessage());           
				  return null;        
				  } finally{
					  fechar();
				  }
			  }
	public void insere (Pessoa pessoa){
		conectar();
		try{
			comando.executeUpdate("INSERT INTO pessoa VALUES('"+pessoa.getRg()+"','"+pessoa.getNome()+"','"+pessoa.getIdade()+"','"+pessoa.getCidade()+"','"+pessoa.getEstado()+"');");
			System.out.println("Pessoa inserida.");
		}catch(SQLException e){
			imprimeErro("Erro ao inserir pessoa", e.getMessage());
		}finally{
			fechar();
		}
	}
	public void conectar(){
		try{
			con = ConFactory.conexao(url, nome, senha, ConFactory.MySQL);
			comando = con.createStatement();
			System.out.println(". . . Conectando...");
			}catch(ClassNotFoundException e){
				imprimeErro("Erro ao carregar drive", e.getMessage());
			}catch(SQLException e){
				imprimeErro("Erro ao carregar o drive", e.getMessage());
			}finally{
			System.out.println("Conexao estabelecida");
		}
	}
	public void fechar(){
		try{
			comando.close();
			con.close();
			System.out.println("Conexao fechada.");
		}catch(SQLException e){
			imprimeErro("erro ao conectar", e.getMessage());
	
		}
	}
	
private void imprimeErro(String msg, String msgErro) {        
		JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);        
		System.err.println(msg);        
		System.out.println(msgErro);        
		System.exit(0);     
	}
}
