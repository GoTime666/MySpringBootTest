package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DBConnection {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql:///db_test";
		String username = "root";
		String password = "1234";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	private static BasicDataSource dataSource = new BasicDataSource();
	static {
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///tb_test?serverTimezone=UTC&characterEncoding=utf-8");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");

		dataSource.setInitialSize(10);
		dataSource.setMaxActive(8);
		dataSource.setMaxIdle(5);
		dataSource.setMinIdle(1);
	}

	public static DataSource getDataSource() {
		return dataSource;
	}
}
