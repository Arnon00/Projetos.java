package ConnectionFactory;

import java.sql.*;

public class ConnectionFactory {
	
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/acervo?useSSL=false";
	private static String LOGIN ="root";
	private static String PASS = "";
	
	public static Connection getConnection(){
		try{	
			Class.forName(DRIVER);
		   }catch(Exception ex){
								  ex.printStackTrace();
								  System.out.println("Erro no DRIVER!");
								}
		
		try{
			return DriverManager.getConnection(URL,LOGIN,PASS); 
		   }catch(Exception ex){
			   					 ex.printStackTrace();
			   					 System.out.println("Erro para Obter a conexão");
		   					   }
				return null;	   		   
	}
	
	public static void close(Connection con){
		if(con != null)
			{
			  try{
				  con.close();
			  	 }catch(SQLException ex)
			  		{
			  		 System.out.println("Erro ao fechar conexão");
			  		 ex.printStackTrace();
			  		}
			}
	}
	
	public static void close(Connection con, Statement stmt){
		if(stmt != null)
			{
			  try{
				  stmt.close();
			  	 }catch(SQLException ex)
			  		{
			  		 System.out.println("Erro ao fechar conexão, ou Statment");
			  		 ex.printStackTrace();
			  		}finally{
			  			close(con);
			  		}
			}
	}
	
	public static void close(Connection con, Statement stmt, ResultSet rst){
		if(rst != null)
			{
			  try{
				  rst.close();
			  	 }catch(SQLException ex)
			  		{
			  		 System.out.println("Erro ao fechar conexão, Statment ou ResultSet");
			  		 ex.printStackTrace();
			  		}finally{
			  			close(con,stmt);
			  		}
			}
	}
	
}
