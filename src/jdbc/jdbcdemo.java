package jdbc;

import java.sql.*;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class jdbcdemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try{
//			Driver driver = new FabricMySQLDriver();
//			DriverManager.registerDriver(driver);
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_sql", "root", "ךששו");
			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("select * from cinema");
			String sql = "insert into cinema"+ "(name, description, address)"+"values('TV_hall', 'perfect', 'kiev')";
			statement.executeUpdate(sql);
//			while (resultSet.next()) {
//				System.out.println(resultSet.getString("name")+"    "+resultSet.getString("description")+"    "+resultSet.getString("address"));
//				
//			}
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
