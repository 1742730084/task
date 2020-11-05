package com.task.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.task.bean.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpDao extends BaseMapper<Emp> {
////  所有的查询
//    List<Emp> queryAll(Emp emp);
//
////  添加
//    int insert(Emp emp);
//
////  修改
//    int update(Emp emp);
//
////  删除
//    @Delete("delete from t_emp where username=#{username}")
//    int deleteById(String username);

//    查询所有列名
    @Select("SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_SCHEMA = 'task_management' AND TABLE_NAME = 't_emp'")
    List<String> nameList();
}
