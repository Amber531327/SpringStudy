package ioc02;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)//单例，默认值
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)//使用多例就不会在销毁的时候用destror了
@Component
public class Javabean {
    //记住这里要导入依赖才能使用这两个注解
    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
