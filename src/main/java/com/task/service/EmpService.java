package com.task.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.task.bean.Emp;

import java.util.List;

public interface EmpService extends IService<Emp> {
    //  所有的查询
    List<Emp> queryAll(Emp emp);

    //  添加
    int insert(Emp emp);

    //  修改
    int update(Emp emp);

    //  删除
    int delete(Emp emp);
}
