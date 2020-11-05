package com.task.bean;

public class Task {
    private Integer id;
    private String taskName;
    private String taskBeginTime;
    private String taskEndTime;
    private String taskDescription;
    private String taskState;
    private String staffId;
    private String empId;
    private Emp emp;

    public Task() {
    }

    public Integer getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskBeginTime() {
        return taskBeginTime;
    }

    public String getTaskEndTime() {
        return taskEndTime;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskState() {
        return taskState;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getEmpId() {
        return empId;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskBeginTime(String taskBeginTime) {
        this.taskBeginTime = taskBeginTime;
    }

    public void setTaskEndTime(String taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskBeginTime='" + taskBeginTime + '\'' +
                ", taskEndTime='" + taskEndTime + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskState='" + taskState + '\'' +
                ", staffId='" + staffId + '\'' +
                ", empId='" + empId + '\'' +
                ", emp=" + emp +
                '}';
    }
}
