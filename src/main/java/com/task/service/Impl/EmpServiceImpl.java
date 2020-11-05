package com.task.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.task.service.EmpService;
import com.task.bean.Emp;
import com.task.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author admin
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpDao,Emp> implements EmpService {
    @Autowired
    private EmpDao dao;

    private String empName = "com.task.bean.Emp";

    public Map map(Object o, String className, List<String> nameList){
        Map<String, String> map = new HashMap<>();
        try{
            Class clazz = Class.forName(className);
            // 获取对象属性
            Field[] fields = clazz.getDeclaredFields();
            for(int i = 0; i < fields.length; i++) {
                try {
                    String name = fields[i].getName();
                    Field field = clazz.getDeclaredField(name);
                    field.setAccessible(true); // 私有属性必须设置访问权限
                    String result = field.get(o).toString();
                    if (null != result && !"".equals(result)) {
                        map.put(nameList.get(i), result.toString());
                    }
                } catch (Exception e) {}
            }
        }catch (Exception e){}
        return map;
    }

    private Map map(Object o){
        return map(o, empName, dao.nameList());
    }

    @Override
    public List<Emp> queryAll(Emp emp){
        return dao.selectByMap(map(emp));
    }

    @Override
    public int insert(Emp emp) {
        return dao.insert(emp);
    }

    @Override
    public int update(Emp emp) {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.eq("id",emp.getUsername());
        return dao.update(emp,wrapper);
    }

    @Override
    public int delete(Emp emp) {
        Map map = map(emp);
        if(map.size() > 0)
            return dao.deleteByMap(map);
        else
            return 0;
    }
}
