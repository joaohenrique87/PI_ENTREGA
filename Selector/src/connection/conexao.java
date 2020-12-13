package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
	
	private static final String USERNAME = "root"; 
	private static final String PASSWORD = "senac2020"; 
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/gerenciamento_pss?useTimezone=true&serverTimezone=UTC";
	
	
	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();
		if(con!=null) {
			System.out.println("Conex�o obtida com sucesso");
			con.close();
		}
	}
}
