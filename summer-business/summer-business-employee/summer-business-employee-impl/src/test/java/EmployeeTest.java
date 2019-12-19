import com.summer.business.employee.core.service.EmployeeService;
import com.summer.business.employee.dao.EmployeeMapper;
import com.summer.Starter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest(classes=Starter.class)
@RunWith(SpringRunner.class)
public class EmployeeTest {

//    @Autowired
//    DataSource dataSource;

    @Autowired
    EmployeeService employeeService;

    @Test
    public void testEmployee() throws SQLException {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        System.out.println("hello");
//        System.out.println(dataSource.getClass());
//        Connection connection = dataSource.getConnection();
//        System.out.println("connection: " + connection);
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//        Resource[] resources;
//        try {
//            resources = resourcePatternResolver.getResources("classpath*:config/mappers/*.xml");
//            for(Resource filename:resources) System.out.println(filename.getFilename());
//            sqlSessionFactoryBean.setMapperLocations(resources);
//            EmployeeMapper employeeMapper = sqlSessionFactoryBean.getObject().openSession().getMapper(EmployeeMapper.class);
//            System.out.println(employeeMapper.queryAll());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println(employeeService.queryAll().toString());
    }
}
