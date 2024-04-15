package ioc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
//    @Autowired
//    private UerService userServiceImpl;//有多个实现类就会优先按照属性名查找

    @Autowired
    @Qualifier(value = "newUSerService")
    private UerService userservice;

    public void show(){
        userservice.show();
    }
}
