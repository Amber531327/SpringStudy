import config.MyConfiguration1;
import config.StudentConfiguration;
import ioc02.MyConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class IocTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Object jdbcTemplate = context.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
    }

    @Test
    public void importtest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration1.class);
    }

}
