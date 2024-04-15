import ioc01.XxxController;
import ioc02.Javabean;
import ioc03.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class iocTest {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring01.xml");
        //添加ioc注解，组件id默认是类名的首字母小写
        Object xxxDao = context.getBean("xxxDao");
        XxxController bean = context.getBean(XxxController.class);
        System.out.println(xxxDao);
        System.out.println(bean);
    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");
        Javabean bean = context.getBean(Javabean.class);
        Javabean bean1 = context.getBean(Javabean.class);
        System.out.println(bean1 ==bean);
        context.close();
    }

    @Test
    public void test03(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring03.xml");
        UserController bean = context.getBean(UserController.class);
        bean.show();
    }

    @Test
    public void test04(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring04.xml");
        ioc04.Javabean bean = context.getBean(ioc04.Javabean.class);
        System.out.println(bean);
    }
}
