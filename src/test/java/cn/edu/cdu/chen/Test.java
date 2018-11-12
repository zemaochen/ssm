package cn.edu.cdu.chen;

import cn.edu.cdu.chen.Model.Bean1;
import cn.edu.cdu.chen.Model.Bean2;
import cn.edu.cdu.chen.Model.Bean3;
import cn.edu.cdu.chen.Model.Bean4;
import cn.edu.cdu.chen.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testFunction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans/springBean.xml");
        //1.无参构造方式获取Bean1
        Bean1 bean1 = (Bean1)context.getBean("Bean1");
        System.out.println(bean1.toString());
        //2.静态工厂
        Bean2 bean2 = (Bean2)context.getBean("Bean2");
        System.out.println(bean2.toString());
        //3.实列化工厂
        Bean3 bean3 = (Bean3) context.getBean("Bean3");
        System.out.println(bean3.toString());
        //4.FactoryBean接口获取
        Bean4 bean4 = (Bean4) context.getBean("Bean4");
        System.out.println(bean4.toString());
    }
}