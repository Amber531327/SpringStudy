package Spring.test;

import FactoryBean06.FactoryBean;
import FactoryBean06.JavaBean4;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcreateioc03.A;
import springcreateioc03.HappyComponent;
import springiocscope05.JavaBean2;
import springiocscope05.JavaBean3;

public class SpringIoCTest {
    public void createIoC(){
        //方式1:实例化并且指定配置文件
        //参数：String...locations 传入一个或者多个配置文件
        ApplicationContext context0 = new ClassPathXmlApplicationContext("spring01.xml", "spring02.xml", "spring03.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("spring03.xml");

        //方式2:先实例化，再指定配置文件，最后刷新容器触发Bean实例化动作 [springmvc源码和contextLoadListener源码方式]
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext();
        context1.setConfigLocations("spring01.xml", "spring02.xml", "spring03.xml");//注意setConfigLocations和setConfigLocation的区别
        context1.refresh();



    }
    @Test
    public void getBean(){
        //方式1: 根据id获取
        //没有指定类型,返回为Object,需要类型转化!
        ApplicationContext context2 = new ClassPathXmlApplicationContext("spring03.xml");
        HappyComponent happyComponent1 = (HappyComponent) context2.getBean("happyComponent");


        //方式2: 根据id和类型获取
        HappyComponent happyComponent2 = context2.getBean("happyComponent", springcreateioc03.HappyComponent.class);
        A happyComponent3 = context2.getBean("happyComponent", A.class);
        //方式3: 根据类型获取
        //根据类型获取,但是要求,同类型(当前类,或者之类,或者接口的实现类)只能有一个对象交给IoC容器管理
        //配置两个或者以上出现: org.springframework.beans.factory.NoUniqueBeanDefinitionException 问题
        A happyComponent4 = context2.getBean(A.class);
//        根据类型来获取bean时，在满足bean唯一性的前提下，其实只是看：『对象 instanceof 指定的类型』的返回结果，
//        只要返回的是true就可以认定为和类型匹配，能够获取到。
        happyComponent2.doWork();
        happyComponent1.doWork();
        System.out.println(happyComponent4 == happyComponent3);
    }

    @Test
    public void test04(){
        //只要一创建就会调用初始方法
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring04.xml");
        //必须在手动释放后才会有结束方法的调用
        context.close();
    }

    @Test
    public void test05(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring05.xml");
        JavaBean2 javabean = context.getBean("JavaBean4", JavaBean2.class);
        JavaBean2 javabean1 = context.getBean("JavaBean4", JavaBean2.class);
        System.out.println(javabean1 == javabean);
        JavaBean3 javabean2 = context.getBean("javabean2", JavaBean3.class);
        JavaBean3 javabean3 = context.getBean("javabean2", JavaBean3.class);
        System.out.println(javabean2 == javabean3);

    }
    @Test
    public void test06(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring06.xml");
        JavaBean4 javabean = context.getBean("javabean", JavaBean4.class);
//        工厂bean的标识就是&id值
        FactoryBean bean = context.getBean("&javabean", FactoryBean.class);
        System.out.println(javabean);
        System.out.println(bean);


    }
}
