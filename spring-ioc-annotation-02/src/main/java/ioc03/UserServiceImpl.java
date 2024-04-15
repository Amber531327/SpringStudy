package ioc03;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UerService{
    @Override
    public void show() {
        System.out.println("UserServiceImpl.show");
    }
}
