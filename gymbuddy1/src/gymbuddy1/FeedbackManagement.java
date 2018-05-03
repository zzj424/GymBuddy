import java.sql.*;

public class FeedbackManagement 
{
	public void addFeedback(String feedback)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/gymbuddy", "qvbingo", "ognib646");
			PreparedStatement oPrStmt = con
				.prepareStatement("SELECT * FROM counter where field = feedbacks* ");
			
			ResultSet resultFeedback=oPrStmt.executeQuery();
			int id = resultFeedback.getInt("count");
		
			String sql1="Insert INTO feedbacks(id, response) VALUES (?,?)";
			PreparedStatement statement=con.prepareStatement(sql1);
			
			if(id==0){
				id=1;
			}
			
			statement.setInt(1,id);
			statement.setString(2, feedback);
		
			
			int rowsInserted= statement.executeUpdate(); 
			if(rowsInserted > 0) {
				System.out.println("A new feedback was collected successfully!");
				id++;
				String sql2="UPDATE counter SET count= ? WHERE field = feedback*";
				PreparedStatement updateStmt = con.prepareStatement(sql2);
				updateStmt.setInt(1, id);
			}
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
