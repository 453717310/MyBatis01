package dao;

import bean.Student;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by dll on 2017/9/13.
 */
public interface StudentMapper {
    /**
     * 新增
     * @param student
     */
    void add(Student student);
    /**
     * 新增并获得id
     * @param student
     */
    void addGetId(Student student);

    /**
     * 查询所有
     * @return
     */
    List<Student> find();

    /**
     * 根据id删除
     * @param id
     */
    void delete(@Param("id") Integer id);

    /**
     * 修改
     * @param student
     */
    void update(Student student);

    /**
     * 查询所有
     * @return
     */
    List<Map<String,Object>>findMap();

    /**
     * 根据name查询学生
     * @return
     */
    List<Student> findListByName(Serializable name);

    /**
     * 多条件查询 map key
     */
    List<Student> findMoreContion(Map<String,Object> map);

    /**
     * 多条件查询 下标
     */
    List<Student> findMoreCondition(String name,int age);

    /**
     * 注解
     * @param name
     * @param age
     * @return
     */
    List<Student> findMore(@Param("name") String name,@Param("age") int age);

    /**
     * 查询 if
     * @param student
     * @return
     */
    List<Student> findIf(Student student);

    /**
     * 数组
     * @param nums
     * @return
     */
    List<Student> findArray(int[] nums);

    /**
     * 参数list
     * @param list
     * @return
     */
    List<Student> findList(List<Integer> list);
    /**
     * 参数map
     * @param map
     * @return
     */
    List<Student> findMap1(@Param("myMap") Map<String,Object> map);




}
