package dao.impl;

import bean.Student;
import bean.Teacher;
import dao.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by dll on 2017/9/13.
 */
public class StudentMapperImpl implements StudentMapper {
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    @Override
    public void add(Student student) {

        try {
            sqlSession.insert("add", student);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }

    /**
     * 新增并获得id
     *
     * @param student
     */
    @Override
    public void addGetId(Student student) {
        try {
            sqlSession.insert("addGetId", student);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Override
    public List<Student> find() {
        List<Student> list=null;
        try {
            list = sqlSession.selectList("find");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        return list;
    }

    /**
     * 根据id删除
     *
     * @param id
     */
    @Override
    public void delete(Serializable id) {
        try {
            sqlSession.update("delete",id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }

    /**
     * 修改
     *
     * @param student
     */
    @Override
    public void update(Student student) {
        try {
            sqlSession.update("update",student);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public Map<String, Object> findMap() {
        Map<String, Object> selectMap  = sqlSession.selectMap("findMap","id");
        return selectMap;
    }
}
