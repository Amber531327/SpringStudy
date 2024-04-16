package advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

    @Before(value = "execution(public int service.Impl.PureCalculationImpl.add(int,int))")
    public void start(){
        System.out.println("方法开始");
    }

    @After(value = "execution(public int service.Impl.PureCalculationImpl.add(int,int))")
    public void end(){
        System.out.println("方法结束");
    }

    @AfterThrowing(value ="execution(public int service.Impl.PureCalculationImpl.add(int,int))")
    public void After(){
        System.out.println("方法异常");
    }
}
