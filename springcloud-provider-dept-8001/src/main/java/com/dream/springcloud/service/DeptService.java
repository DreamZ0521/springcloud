package com.dream.springcloud.service;

import com.dream.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    //添加数据
    public boolean addDept(Dept dept);

    //通过id查找
    public Dept queryById(Long id);

    //查询全部
    public List<Dept> queryAll();


}
