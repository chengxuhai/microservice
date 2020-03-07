package demo.microservice.provider.service;

import demo.microservice.provider.dao.DeptDao;
import demo.microservice.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptDao deptDao;

    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
