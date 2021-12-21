package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//在注解里面value属性值可以省略
//默认值是类名称，首字母小写
//UserService -- userService
//@Component(value = "userService")//<bean id="" class="">

//@Service

@Controller
public class UserService {
    //定义dao
    //不需要添加set方法
    //添加属性注解
    @Autowired //根据类型进行注入
    @Qualifier(value = "userDaoImpl1")  //根据名称注入，多个同类型不知道找哪个,要跟着Autowired一起使用
    private UserDao userDao;

    public void add(){
        System.out.println("service add...");
        userDao.add();
    }
}
