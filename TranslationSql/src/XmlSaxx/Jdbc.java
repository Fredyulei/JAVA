package XmlSaxx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st=null;
		ResultSet rs=null;
		try {
			String driver = getProperties("db.driver");
			Class.forName(driver);
			String url = getProperties("db.url");
			String a = getProperties("db.username");
			String b = getProperties("db.password");
			conn = DriverManager.getConnection(url, a, b);
			st=conn.createStatement();
			rs=st.executeQuery("select*from college");
			while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String description=rs.getString("description");
				System.out.println("college id:"+id+",name:"+name+",description:"+description);
			}
			
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null)
				rs.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				if(st !=null)
				st.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static String getProperties(String key) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("jdbc.properties"));
			return prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
