package cn.edu.cdu.chen;

import cn.edu.cdu.chen.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cn.edu.cdu.chen.Beans.Pojo.pojoConfig;
import  cn.edu.cdu.chen.Beans.Pojo.User;

public class Test {
    public static void main(String[] args) {
      /*  SqlSession sqlSession = cn.edu.cdu.chen.Utils.SqlsessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.printf(user.getUsername());*/
        /*xml实现bean*/
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans/userBean.xml");
        UserList userList = (UserList)context.getBean("UsersList1");
        Iterator iterator = userList.getUsers().iterator();
        User user;
        while (iterator.hasNext()){
            user = (User) iterator.next();
            System.out.printf(user.getUsername());
        }*/
        /*注解实现bean*/
        ApplicationContext context = new AnnotationConfigApplicationContext(pojoConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.UserInfo();
    }
}