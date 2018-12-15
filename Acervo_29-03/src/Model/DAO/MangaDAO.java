package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConnectionFactory.ConnectionFactory;
	
public class MangaDAO {
	
	private Connection con = null;
	
	public MangaDAO() {
		
	}

	public boolean save(MangaDAO MangaDAO){
		String sql = "INSERT INTO manga (titulo,autor,numero,ano,editora_id,qtd_pag,preço_unitario) VALUES (?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		try{
			
		stmt = con.prepareStatement(sql);
		//stmt.setString(1,2,3,4,5,6);
		
		return true;
		}catch(SQLException sqlException)
			  {
				sqlException.printStackTrace();
				return false;
			  }
	}
	
	public void consulta(){
		
		con = ConnectionFactory.getConnection();
		
		String sql = "SELECT * FROM manga";
		
		PreparedStatement stmt = null;
		ResultSet rest = null;
		
		try{
			stmt = con.prepareStatement(sql);
			rest = stmt.executeQuery();
			
			while(rest.next()){
				
				String[] dados = new String [8];
				
			dados[0] = rest.getString("id");
			dados[1] = rest.getString("titulo");
			dados[2] = rest.getString("autor");
			dados[3] = rest.getString("numero");
			dados[4] = rest.getString("ano");
			dados[5] = rest.getString("editora_id"); 
			dados[6] = rest.getString("qtd_pag");
			dados[7] = rest.getString("preço_unitario");
			
			System.out.println(dados[0]+" | id: "+dados[1]+" | Profissão: "+dados[2]+" | Nascimento: "+dados[3]+" | Sexo: "+dados[4]+" | Peso: "+dados[5]+" | Altura: "+dados[6]+" | Nacionalidade: "+dados[7]);
			//Tela telinha = new Tela();
			//telinha.modelo.addRow(dados);
		}
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			ConnectionFactory.close(con, stmt, rest);
			System.out.println("Conexão fechada.");
		}
			
		
	}
	
	public static void main(String[] args){

		MangaDAO mg = new MangaDAO();
		
		mg.consulta();
	}
	
}
