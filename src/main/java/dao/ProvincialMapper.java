package dao;

import bean.Provincial;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dll on 2017/9/22.
 */
public interface ProvincialMapper {

    Provincial selectProvincialById(Serializable id);
}
