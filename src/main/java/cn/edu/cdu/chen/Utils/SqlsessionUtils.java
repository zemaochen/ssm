package cn.edu.cdu.chen.Utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlsessionUtils {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlsessionUtils() {}
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    /**
     *
     * @return sqlsession
     */
    public synchronized static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
