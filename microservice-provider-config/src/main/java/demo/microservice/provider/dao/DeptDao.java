package demo.microservice.provider.dao;

import demo.microservice.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {

    @Select("select * from t_dept")
    List<Dept> findAll();
}
