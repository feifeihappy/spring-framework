import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCountCallbackHandler;

/**
 * description：TODO
 * time：2025/6/4 10:05
 * auther：zhaopengfei
 */
public class TestJdbctemplate {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Test
	public void test() {
		int update = jdbcTemplate.update("");
		jdbcTemplate.query("",new RowCountCallbackHandler());
		System.out.println(update);
	}

}
