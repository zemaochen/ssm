package cn.edu.cdu.chen.Utils;

import cn.edu.cdu.chen.Model.User;

import java.util.List;

public class UserList {
    private List<User> users;

    public UserList() {
    }

    public UserList(List<User> users) {
        this.users = users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
