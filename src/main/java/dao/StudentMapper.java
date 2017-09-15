package dao;

import bean.Student;

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
    void delete(Serializable id);

    /**
     * 修改
     * @param student
     */
    void update(Student student);

    /**
     * 查询所有
     * @return
     */
    Map<String,Object> findMap();

    /**
     * 根据name查询学生
     * @return
     */
    List<Student> findListByName(Serializable name);

}
