package com.task.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_emp")
public class Emp {
    private String username;
    private String name;
    private String password;
    private String sex;
    private String birthday;
    private String hireDate;
    private String position;
    private String qualification;
    private String professional;
    private String experience;
    private String flag;
    private String superId;

//    private Emp superior;
//    public Emp() {
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public String getHireDate() {
//        return hireDate;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public String getQualification() {
//        return qualification;
//    }
//
//    public String getProfessional() {
//        return professional;
//    }
//
//    public String getExperience() {
//        return experience;
//    }
//
//    public String getFlag() {
//        return flag;
//    }
//
//    public String getSuperId() {
//        return superId;
//    }
//
//    public Emp getSuperior() {
//        return superior;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public void setHireDate(String hireDate) {
//        this.hireDate = hireDate;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
//
//    public void setProfessional(String professional) {
//        this.professional = professional;
//    }
//
//    public void setExperience(String experience) {
//        this.experience = experience;
//    }
//
//    public void setFlag(String flag) {
//        this.flag = flag;
//    }
//
//    public void setSuperId(String superId) {
//        this.superId = superId;
//    }
//
//    public void setSuperior(Emp superior) {
//        this.superior = superior;
//    }
//
//    @Override
//    public String toString() {
//        return "Emp{" +
//                "username='" + username + '\'' +
//                ", name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                ", sex='" + sex + '\'' +
//                ", birthday='" + birthday + '\'' +
//                ", hireDate='" + hireDate + '\'' +
//                ", position='" + position + '\'' +
//                ", qualification='" + qualification + '\'' +
//                ", professional='" + professional + '\'' +
//                ", experience='" + experience + '\'' +
//                ", flag='" + flag + '\'' +
//                ", superId='" + superId + '\'' +
//                ", superior=" + superior +
//                '}';
//    }
}
