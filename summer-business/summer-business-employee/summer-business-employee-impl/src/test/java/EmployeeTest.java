import com.summer.business.employee.core.service.EmployeeService;
import com.summer.business.Starter;
import com.summer.business.employee.dao.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

@SpringBootTest(classes=Starter.class)
@RunWith(SpringRunner.class)
public class EmployeeTest {

//    @Autowired
//    DataSource dataSource;

    @Autowired
    EmployeeMapper employeeMapper;

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
        System.out.println(employeeMapper.queryAll().toString());
    }
}
