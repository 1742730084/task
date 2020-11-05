package com.task;

import com.task.dao.EmpDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import java.util.HashMap;

/**
 * @ClassName Test
 * @Description TODO
 * @Author admin
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    EmpDao dao;

    @Test
    public void delete(){
        HashMap<String, Object> map = new HashMap<>();
        int i = dao.deleteByMap(map);
        System.out.println(i);
    }
}
