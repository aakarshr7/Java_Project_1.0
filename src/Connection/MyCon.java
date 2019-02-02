package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
public class MyCon {

	Connection con;
		public Connection config() {
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence","root","");
		
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return con;
	}
}
