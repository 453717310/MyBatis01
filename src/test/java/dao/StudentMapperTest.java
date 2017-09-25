package dao;
import bean.Country;
import bean.Provincial;
import bean.Student;
import bean.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MybatisUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by dll on 2017/9/13.
 */
public class StudentMapperTest {
    private Logger logger=Logger.getLogger(StudentMapperTest.class);
    StudentMapper studentMapper=null;
    CountryMapper countryMapper=null;
    ProvincialMapper provincialMapper=null;
    TeacherMapper teacherMapper=null;
    SqlSession sqlSession=null;
    @Before
    public void setUp() throws Exception {
        sqlSession = MybatisUtil.getSqlSession();
        //studentMapper=sqlSession.getMapper(StudentMapper.class);
        //countryMapper=sqlSession.getMapper(CountryMapper.class);
        //provincialMapper=sqlSession.getMapper(ProvincialMapper.class);
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void test01(){
        Student student=new Student();
        student.setAge(29);
        student.setName("小黑1");
        studentMapper.add(student);
        sqlSession.commit();
    }
    @Test
    public void test06(){
        Student student=new Student();
        student.setAge(29);
        student.setName("小黑333");
        studentMapper.addGetId(student);
        sqlSession.commit();
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
        studentMapper.delete(7);
        sqlSession.commit();
    }
    @Test
    public void test04(){
        List<Map<String, Object>> map = studentMapper.findMap();
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
    @Test
    public void test08(){
       Map<String,Object> map=new HashMap<>();
       map.put("stuName","小");
       map.put("stuAge",20);
       List<Student> moreContion = studentMapper.findMoreContion(map);
       logger.debug(moreContion);
    }
    @Test
    public void test09(){
        Map<String,Object> map=new HashMap<>();
        map.put("stuName","小");
        map.put("stuAge",25);
        Student student=new Student();
        student.setId(10);
        student.setName("小黑1");
        map.put("stu",student);
        List<Student> moreContion = studentMapper.findMoreContion(map);
        logger.debug(moreContion);

    }
    @Test
    public void test10(){
        List<Student> moreContion = studentMapper.findMoreCondition("小",25);
        logger.debug(moreContion);
    }
    @Test
    public void test11(){
        List<Student> moreContion = studentMapper.findMore("小",25);
        logger.debug(moreContion);
    }

    @Test
    public void test12(){
        Student student=new Student();
        student.setName("小");
        student.setAge(25);
        List<Student> anIf = studentMapper.findIf(student);
        logger.debug(anIf);
    }
    @Test
    public void test13(){
        int[] nums={10,15,16};
        List<Student> array = studentMapper.findArray(nums);
        logger.debug(array);
    }
    @Test
    public void test14(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(13);
        list.add(14);
        list.add(15);
        List<Student> array = studentMapper.findList(list);
        logger.debug(array);
    }
    @Test
    public void test15(){
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("10","object1");
       map.put("15","object2");
       map.put("16","object3");
        List<Student> map1 = studentMapper.findMap1(map);
        logger.debug(map1);
    }
    @Test
    public void test16(){
        Country countryById = countryMapper.getCountryById(1);
        logger.debug(countryById.getName());

    }
    @Test
    public void test17(){
        Provincial provincial = provincialMapper.selectProvincialById(1);
        logger.debug(provincial);

    }
    @Test
    public void test18(){
        List<Teacher> teacherById = teacherMapper.getTeacherById(2);
        logger.debug(teacherById);
    }
    @Test
    public void test19(){
        List<Teacher> teacherById = teacherMapper.getTeacher(6);
        logger.debug(teacherById);
    }
}