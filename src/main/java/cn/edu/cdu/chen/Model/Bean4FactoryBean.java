package cn.edu.cdu.chen.Model;

import org.springframework.beans.factory.FactoryBean;

public class Bean4FactoryBean implements FactoryBean<Bean4> {
    /*必须实现FactoryBean接口*/
    public Bean4FactoryBean() {
        super();
    }

    @Override
    public Bean4 getObject() throws Exception {
        /*初始化数据*/
        return new Bean4();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
