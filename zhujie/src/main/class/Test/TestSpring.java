package Test;


import Util.JDBC;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class TestSpring {
    @Test
    public void testService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testService2(){
        ApplicationContext context=new AnnotationConfigApplicationContext(config.SpringConfig.class);
        UserService userService=context.getBean("userService",UserService.class);

        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testService3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        JDBC userService=context.getBean("jdbc",JDBC.class);
        System.out.println(userService);
        userService.su();
    }
}
