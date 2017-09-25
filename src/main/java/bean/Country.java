package bean;

import java.util.Set;

/**
 * Created by dll on 2017/9/22.
 * 国家对应的实体类
 */
public class Country {
    private Integer id;
    private String name;
    /*一对多关联查询*/
    private Set<Provincial> provincials;

    public Country() {
    }

    public Country(Integer id, String name, Set<Provincial> provincials) {
        this.id = id;
        this.name = name;
        this.provincials = provincials;
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

    public Set<Provincial> getProvincials() {
        return provincials;
    }

    public void setProvincials(Set<Provincial> provincials) {
        this.provincials = provincials;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
