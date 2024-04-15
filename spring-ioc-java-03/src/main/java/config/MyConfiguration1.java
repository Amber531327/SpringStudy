package config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {MyConfiguration2.class})
@Configuration
public class MyConfiguration1 {
}
