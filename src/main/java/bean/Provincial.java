package bean;

/**
 * Created by dll on 2017/9/22.
 * 省会
 */
public class Provincial {
    private Integer pid;//省会id
    private String pname;//省会名称
    /*多对一查询*/
    private Country country;
    public Provincial() {
    }

    public Provincial(Integer pid, String pname, Country country) {
        this.pid = pid;
        this.pname = pname;
        this.country = country;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Provincial{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", country=" + country +
                '}';
    }
}
