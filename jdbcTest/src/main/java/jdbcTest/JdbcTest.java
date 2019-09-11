package jdbcTest;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;

import bean.Book;
import jdbc.DBConnection;

public class JdbcTest {
	private QueryRunner qr = new QueryRunner(DBConnection.getDataSource());

	@Test
	public void fun1() {
		System.out.println("junit5");
		String sql = "select * from tb_book";
		List<Book> list=null;
		try {
			list = qr.query(sql, new BeanListHandler<Book>(Book.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Book book : list) {
			System.out.println(book);
		}
	}
}
