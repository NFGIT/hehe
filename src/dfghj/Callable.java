package dfghj;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURl = "jdbc:sqlserver://localhost:1433;DatabaseName=diyuan";
		String username = "DiYuan";
		String userpass = "12345";
		try {
			Class.forName(drivername);

			Connection conn = DriverManager.getConnection(dbURl,username,userpass);
			CallableStatement call = conn.prepareCall("{call GGG(?)}");
			call.setString(1,"hhh");
			ResultSet rs = call.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+rs.getInt(2));
			}
	 	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
