import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.test.context.junit4.SpringRunner;
import com.summer.fundamental.druid.Starter;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

@SpringBootTest(classes= Starter.class)
@RunWith(SpringRunner.class)
public class SpringbootJdbcConnectionTest {
    @Autowired
    DataSource dataSource;

    SqlSessionFactoryBean SqlSessionFactoryBean;

    @Test
    public void contextLoad() throws SQLException{
        System.out.println("dataSource: " + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("connection: " + connection);


//        Statement statement=dataSource.getConnection().createStatement();
//        String sql = "select * from employee;";
//        ResultSet resultSet=statement.executeQuery(sql);
//
//        while(resultSet.next()){
//            int id=resultSet.getInt(1);
//            String name = resultSet.getString(2);
//            int age=resultSet.getInt(3);
//            System.out.println(id+"\t"+name+"\t"+age);
//        }
        connection.close();
    }
}
