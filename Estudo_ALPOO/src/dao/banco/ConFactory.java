package dao.banco;

import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.SQLException;

public class ConFactory {

	public static final int MySQL = 0;
	private static final String MySQLDriver = "com.mysql.jdbc.Driver";
	
	public static Connection conexao (String url, String nome, String senha, int banco)
			throws ClassNotFoundException, SQLException {
		switch(banco) {
			case MySQL:
				Class.forName(MySQLDriver);
				break;
				
			//case SQLServer:
				//Class.forName(SQLServerDriver);
				//break;
			}
		return DriverManager.getConnection(url, nome, senha);
		}
	}