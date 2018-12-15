package Connection;

import java.sql.*;

public class ConnectionFactory {

	private static  String DRIVER;
	private static  String URL;
	private static  String USER;
	private static  String PASS;
	
	public ConnectionFactory(){
		
		DRIVER = "com.mysql.jdbc.Driver";
		URL = "jdbc:mysql://localhost:3306/entrevista_backend";
		USER = "root";
		PASS = "";
	}
	
	public static Connection getConnection(){
		
		try{
			
			try {
				Class.forName(DRIVER);
				} catch (ClassNotFoundException e) 
					{
					  System.out.println("Erro no Driver");
				      e.printStackTrace();
					}
			
			return DriverManager.getConnection(URL,USER,PASS);
			
			}catch(SQLException ex)
				{
				  System.out.println("Erro no retorno de Conexão");
				  ex.printStackTrace();
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
}
