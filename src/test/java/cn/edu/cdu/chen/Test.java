package cn.edu.cdu.chen;

import cn.edu.cdu.chen.Dao.UserMapper;
import cn.edu.cdu.chen.Model.User;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = cn.edu.cdu.chen.Utils.SqlsessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.printf(user.getUsername());
    }
}