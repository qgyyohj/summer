import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import src.summer.fundamental.druid.Starter;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest(classes= Starter.class)
@RunWith(SpringRunner.class)
public class SpringbootJdbcConnectionTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoad() throws SQLException{
        System.out.println("dataSource: " + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("connection: " + connection);
        connection.close();
    }
}
