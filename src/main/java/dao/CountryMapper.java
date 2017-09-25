package dao;

import bean.Country;

import java.io.Serializable;

/**
 * Created by dll on 2017/9/22.
 */
public interface CountryMapper {
    /**
     * 根据id获取国家信息
     * @param id
     * @return
     */
    Country getCountryById(Serializable id);
}
