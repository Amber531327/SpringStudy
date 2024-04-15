package ioc02;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@PropertySource("durid.properties")
@ComponentScan(basePackages = {"ioc02"})
public class MyConfiguration {

    //如果第三方类进行IoC管理,无法直接使用@Component相关注解
    //解决方案: xml方式可以使用<bean标签
    //解决方案: 配置类方式,可以使用方法返回值+@Bean注解

    //方法的名字 == bean id
    //方法的返回值类型 == bean组件的类型或其他的接口和父类
    @Bean(value = "d1",initMethod = "",destroyMethod = "")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DataSource dataSource(
            @Value("${user}") String username,
            @Value("${password}")String password,
            @Value("${url}")String url,
            @Value("${driver}")String driverClassName
    )
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Bean("d2")
    public DataSource dataSource2(
            @Value("${user}") String username,
            @Value("${password}")String password,
            @Value("${url}")String url,
            @Value("${driver}")String driverClassName
    )
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("d2") DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
