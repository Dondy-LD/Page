package dao.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCutil {
	private static String driver= null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	
	private CallableStatement callableStatement = null;
	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rst = null;
	
	public JDBCutil(String driver, String url, String username, String password){
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}
		
	public Connection getConn(){
		try {
				try {
					Class.forName(driver);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("加载驱动错误");
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
					//获取连接
					conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			return conn;
		}
}
