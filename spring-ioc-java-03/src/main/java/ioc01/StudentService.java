package ioc01;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class StudentService {

    @PostConstruct
    public void init(){
        System.out.println("StudentService.init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("StudentService.destroy");
    }
}
