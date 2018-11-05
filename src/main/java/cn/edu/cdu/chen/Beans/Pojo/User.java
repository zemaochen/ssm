package cn.edu.cdu.chen.Beans.Pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    @Value("1")
    private Integer userid;
    @Value("1号")
    private String username;
    public User(Integer userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}