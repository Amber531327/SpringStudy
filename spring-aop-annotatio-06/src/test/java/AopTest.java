import Config.MyConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import service.Calculator;

@SpringJUnitConfig(value = MyConfiguration.class)
public class AopTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void test(){
        int sum=calculator.add(3,5);
        System.out.println("sum = " + sum);
    }
}
