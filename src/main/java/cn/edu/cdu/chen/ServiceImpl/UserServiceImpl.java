package cn.edu.cdu.chen.ServiceImpl;


import cn.edu.cdu.chen.Model.User;
import cn.edu.cdu.chen.Service.UserService;

public class UserServiceImpl implements UserService {
    private User user;
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void UserInfo() {
        System.out.printf("id:"+user.getUserid());
        System.out.printf("name:"+user.getUsername());
    }

    @Override
    public boolean login() {
        return false;
    }
}
