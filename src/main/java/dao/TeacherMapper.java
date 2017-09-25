package dao;

import bean.Teacher;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dll on 2017/9/22.
 */
public interface TeacherMapper {
    List<Teacher> getTeacherById(Serializable id);

    List<Teacher> getTeacher(Serializable id);
}
