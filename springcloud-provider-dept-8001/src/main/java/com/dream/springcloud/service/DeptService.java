package com.dream.springcloud.service;

import com.dream.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    //添加数据
    public boolean addDept(Dept dept);

    //通过id查找
    public Dept queryById(Long id);

    //查询全部
    public List<Dept> queryAll();


}
