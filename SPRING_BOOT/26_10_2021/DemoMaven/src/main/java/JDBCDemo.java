import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch31", "mahesh", "mahesh12@");
			PreparedStatement ps = con.prepareStatement("select * from Employee;");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out
						.println("ID: " + rs.getString(1) + " | Name: " + rs.getString(2) + " | Age: " + rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
