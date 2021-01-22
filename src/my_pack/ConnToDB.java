package my_pack;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ConnToDB {
// Begin Class
	
	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	HashMap<String,String> hashmap = new HashMap<String,String>();
	
	ConnToDB (String choice) {
		
		if (choice.equalsIgnoreCase("for Login")) {
			this.config("person_DB","Reese","Dashwood");
			this.selectToLogin();
		}
		else
			this.config("person_DB","Reese","Dashwood");
		
//		if (choice.equalsIgnoreCase("for SignUp")){
//			this.config("person_DB","Reese","Dashwood");
//			this.insertData();
//		}
		
	}
	
	private void config (String dbName,String dbUsername,String dbPassword) {
	// Begin config()
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connect = DriverManager.getConnection("jdbc:mysql://localhost/"+ dbName +"?user="+ dbUsername +"&password="+ dbPassword +"");
			statement = connect.createStatement();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	// End config()
	}
	
	private void selectToLogin () {
	// Begin select()
		
		try {
			String sqll = "select Email,Password from person";
			
			res = statement.executeQuery(sqll);
			while (res.next()) {
				
				String email = res.getString("Email");
				String passwd = res.getString("Password");
				
				hashmap.put(email,passwd);
				
			}
			
			connect.close();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End select()
	}
	
	void insertData (String fname,String lname,String email,String passwd) {
	// Begin insertData()
		
		try {
			String sqll = "insert into person (f_name,l_name,Email,Password) values ('"+ fname +"','"+ lname +"','"+ email +"','"+ passwd +"')";
			connect.prepareStatement(sqll).executeUpdate();
			
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End insertData()
	}
	
	void updateData () {
	// Begin updateData()
		
		try {
			String sqll = "";
			connect.prepareStatement(sqll).executeUpdate();
			
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			
	// End updateData()
	}
	
	void deleteData () {
	// Begin deleteData()
		
		try {
			String sqll = "";
			connect.prepareStatement(sqll).executeUpdate();
			
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			
	// End deleteData()
	}
	
// End Class
}
