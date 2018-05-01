package gymbuddy1;

import java.sql.*;

public class LoginDao {

	public static boolean validateUser(String name, String pw) {
		boolean validLogin = false;
		try {
			//defining db driver to use
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gymbuddy", "qvbingo", "ognib646");
			
			//prepared   statement is used for secure access
			// ? used for data to put in query
			// actual query to execute is
			// select * from members where username = name and password = pass
			PreparedStatement oPrStmt = con
					.prepareStatement("select * from members where username=? and password=?");// ? represents some parameter to include
			
			oPrStmt.setString(1, name); //setting paramter 1 in prepared stmt to name
			oPrStmt.setString(2, pw); 	//setting parameter 2 in prepared stmt to pw
			ResultSet resultMembers = oPrStmt.executeQuery();	//execute query
			
			if(resultMembers.next()) {
				validLogin = true;
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}	
		return validLogin;
	}
}
