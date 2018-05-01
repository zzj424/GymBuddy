import java.sql.*;

public class FeedbackManagement 
{
	public void addFeedback(int ID, String feedback)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/gymbuddy", "qvbingo", "ognib646");
			PreparedStatement oPrStmt = con
				.prepareStatement("INSERT Feedback(ID,feedback) VALUES(?,?)");
			oPrStmt.setInt(1,ID);
			oPrStmt.setString(2, feedback);
		
			int rowsInserted= oPrStmt.executeUpdate();
			if(rowsInserted > 0) {
			System.out.println("A new feedback was collected successfully!");
			}
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
