package bean;

import java.util.Set;

/**
 * Created by dll on 2017/9/15.
 */
public class Teacher {
    private Integer id;//教师编号
    private String name;//教师的姓名
    /*一个导师对应多个老师*/
    private Set<Teacher> teachers;

    private Teacher teacher;//多个老师对应一个导师
    public Teacher() {
    }

    public Teacher(Integer id, String name, Set<Teacher> teachers, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                ", teacher=" + teacher +
                '}';
    }
}
