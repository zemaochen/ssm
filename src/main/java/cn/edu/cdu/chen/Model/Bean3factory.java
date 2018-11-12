package cn.edu.cdu.chen.Model;

public class Bean3factory {
    /*实列化工厂*/
    //普通方法，无法通过类名调用，所以先实列化factory
    public Bean3 initBean3(){
        return  new Bean3();
    }
}
