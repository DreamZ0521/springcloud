package com.dream.springcloud.dao;

import com.dream.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    //添加数据
    public boolean addDept(Dept dept);

    //通过id查找
    public Dept queryById(Long id);

    //查询全部
    public List<Dept> queryAll();


}
