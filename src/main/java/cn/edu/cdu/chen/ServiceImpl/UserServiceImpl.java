package cn.edu.cdu.chen.ServiceImpl;

import cn.edu.cdu.chen.Beans.Pojo.User;
import cn.edu.cdu.chen.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private User user=null;

    public User getUser() {
        return user;
    }
    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void UserInfo() {
        System.out.printf("id:"+user.getUserid());
        System.out.printf("name:"+user.getUsername());
    }
}
