package com.task.controller;

import com.task.bean.Emp;
import com.task.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author admin
 */
@Controller
public class LoginController {
    @Autowired
    private EmpService service;

    private List<Emp> empList;
    private List<Emp> empAll;
    private List<String> userList = new ArrayList<>();
    private List<Emp> page = new ArrayList<>();
    private Emp emp;
    private Set<String> username = new HashSet();
    private Map<String,Emp> empMap = new HashMap<>();

    @PostMapping("/login")
    @ResponseBody
    public String login(Emp emp, HttpSession session) {
        empList = service.queryAll(emp);
        empList.forEach(System.out::println);
        session.setAttribute("user", empList);
        if (empList.size() == 1) {
            return "1";
        }
        return "0";
    }

    @RequestMapping("/out")
    public String out(HttpSession session) {
        Objects.requireNonNull(session);
        empList = null;
        return "login";
    }

    @GetMapping("/flag")
    @ResponseBody
    public String main(HttpServletRequest request) {
        return empList.get(0).getFlag()+empList.get(0).getName();
    }

    @GetMapping("/user-list")
    @ResponseBody
    public Object[] userList() {
        empAll = service.queryAll(new Emp());
//        empAll.forEach(System.out::println);
        page.removeAll(page);
        int length = empAll.size();
        for(int i = 0; i < length; i++){
            emp = empAll.get(i);
            empMap.put(emp.getUsername(),emp);
            userList.add(emp.getUsername());
            if(i < 3){
                page.add(empAll.get(i));
            }
        }
        Object[] o = new Object[3];
        o[0] = page;
        o[1] = length;
        int page = length / 3 + (length % 3 > 0 ? 1 : 0);
        o[2] = page;
        return o;
    }

    @PostMapping("/user-details")
    @ResponseBody
    public Emp userIdAll(String username){
        return empMap.get(username);
    }

    @PostMapping("/user-delete")
    @ResponseBody
    public String userDelete(String username){
        empMap.remove(username);
        this.username.add(username);
        if(empMap.get(username) == null){
            return "1";
        }else{
            return "0";
        }
    }

    @GetMapping("/leave")
    @ResponseBody
    public String leave(){
        if(this.username.size()>0){
            int i = 0;
            for(String username : this.username){
                Emp emp = new Emp();
                emp.setUsername(username);
                i = service.delete(emp);
                System.out.println("i"+i);
            }
            this.username.removeAll(username);
            return ""+i;
        }
        return "0";
    }

    @PostMapping("/page")
    @ResponseBody
    public Object[] page(String num){
        int a = Integer.parseInt(num) * 3;
        page.removeAll(page);
        for(int i = a; i < a+3; i++){
            if(i < empMap.size()){
                page.add(empMap.get(userList.get(i)));
            }
        }
        int length = empMap.size();
        Object[] o = new Object[3];
        o[0] = page;
        o[1] = length;
        int page = length / 3 + (length % 3 > 0 ? 1 : 0);
        System.out.println(page);
        o[2] = page;
        return o;
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(Emp emp){
        System.out.println("123456000"+emp);
        return "1";
    }
}