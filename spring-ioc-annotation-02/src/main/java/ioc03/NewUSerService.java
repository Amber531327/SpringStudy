package ioc03;

import org.springframework.stereotype.Service;

@Service
public class NewUSerService implements UerService{
    @Override
    public void show() {
        System.out.println("NewUSerService.show");
    }
}
