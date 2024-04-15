package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//标注当前类是配置类，替代application.xml
@Configuration
//使用注解读取外部配置，替代 <context:property-placeholder标签
@PropertySource("jdbc.properties")
//使用@ComponentScan注解,可以配置扫描包,替代<context:component-scan标签
@ComponentScan(basePackages = {"ioc01"})
public class StudentConfiguration {

    @Value("${password}")
    private int password;
}
