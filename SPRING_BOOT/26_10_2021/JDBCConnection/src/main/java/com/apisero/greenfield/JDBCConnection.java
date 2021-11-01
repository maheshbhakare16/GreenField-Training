package com.apisero.greenfield;

import java.sql.*;

public class JDBCConnection {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch31", "mahesh", "mahesh12@");
			PreparedStatement ps = con.prepareStatement("select * from Student;");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(
						"Roll No.: " + rs.getInt(1) + " | Name: " + rs.getString(2) + " | Marks: " + rs.getFloat(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
