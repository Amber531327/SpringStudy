import Component.A;
import Component.B;
import config.Configuration1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = {Configuration1.class})
public class JunitTest {
    @Autowired
    private A a;

    @Test
    public void test(){
        System.out.println(a);
        a.show();
    }

}
