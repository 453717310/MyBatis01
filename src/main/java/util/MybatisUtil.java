package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dll on 2017/9/13.
 * 获取SqlSession 的单例类
 */
public class MybatisUtil {
    //创建静态类的属性
    private static SqlSessionFactory sqlSessionFactory;
    //私有化构造jdsl
    private MybatisUtil(){}
    //提供对外访问的接口
    public static synchronized SqlSession getSqlSession(){
        if (sqlSessionFactory==null){
            InputStream stream = null;
            try {
                stream = Resources.getResourceAsStream("mybatis.xml");
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return sqlSessionFactory.openSession();
    }

}
