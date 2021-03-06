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
			return DriverManager.getConnection(URL,LOGIN,PASS); 
		   }catch(ClassNotFoundException |SQLException ex){
								  throw new RuntimeException("erro na conex�o", ex);
								}	   		   
	}
	
	public static void close(Connection con){
		if(con != null)
			{
			  try{
				  con.close();
			  	 }catch(SQLException ex)
			  		{
			  		 System.out.println("Erro ao fechar conex�o");
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
			  		 System.out.println("Erro ao fechar conex�o, ou Statment");
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
			  		 System.out.println("Erro ao fechar conex�o, Statment ou ResultSet");
			  		 ex.printStackTrace();
			  		}finally{
			  			close(con,stmt);
			  		}
			}
	}
	
}
