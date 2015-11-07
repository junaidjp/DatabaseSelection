import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class BankingQueryDB {
	
	
	public static void main(String args[]) { 
		
		
		
		Connection conn = null;
		try {
			// 1) Load the Database Driver
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofdanish", "root",
					"junaid123");
			System.out.println("Successfully establised a Ping");
			
			System.out.println("USe this connection to Query the Database");
			
			Statement st = conn.createStatement();
			ResultSet resultSet  = st.executeQuery("select * from stock");
			
			while(resultSet.next()) { 
				
				System.out.println(resultSet.getString("stockName"));
				System.out.println(resultSet.getInt("stockId"));
				
			}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();

		}

		
		
		
	}

}
