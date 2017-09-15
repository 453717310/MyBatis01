package dao;

import bean.Student;
import dao.impl.StudentMapperImpl;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by dll on 2017/9/13.
 */
public class StudentMapperTest {
    private Logger logger=Logger.getLogger(StudentMapperTest.class);
    StudentMapper studentMapper=null;
    @Before
    public void setUp() throws Exception {
        studentMapper=new StudentMapperImpl();
    }
    @Test
    public void test01(){

        Student student=new Student();
        student.setAge(29);
        student.setName("小黑1");
        studentMapper.add(student);
    }
    @Test
    public void test06(){

        Student student=new Student();
        student.setAge(29);
        student.setName("小黑333");
        studentMapper.addGetId(student);
        logger.debug("新增的id为："+student.getId());
    }
    @Test
    public void test02(){
        List<Student> list = studentMapper.find();
        for (Student student : list) {
            logger.debug(student);
        }
    }
    @Test
    public void test03(){
        studentMapper.delete(1);
    }
    @Test
    public void test04(){
        Map<String, Object> map = studentMapper.findMap();
        logger.debug("长度为:"+map.size());
        logger.debug(map);

    }
    @Test
    public void test07(){
        Student student=new Student();
        student.setId(11);
        student.setName("六六六");
        student.setAge(90);
        studentMapper.update(student);
    }

}