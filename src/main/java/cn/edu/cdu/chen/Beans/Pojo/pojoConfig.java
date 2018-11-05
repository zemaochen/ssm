package cn.edu.cdu.chen.Beans.Pojo;

import cn.edu.cdu.chen.ServiceImpl.UserServiceImpl;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {User.class, UserServiceImpl.class})
public class pojoConfig {
}
