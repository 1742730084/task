package com.task.bean;

public class Plan {
    private Integer id;
    private String planName;
    private String planState;
    private String feedback;
    private String planBeginDate;
    private String planEndDate;
    private String planDescription;
    private String planFeedback;
    private Integer taskId;

    private Task task;
    public Plan() {
    }

    public Integer getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }

    public String getPlanState() {
        return planState;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getPlanBeginDate() {
        return planBeginDate;
    }

    public String getPlanEndDate() {
        return planEndDate;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public String getPlanFeedback() {
        return planFeedback;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public Task getTask() {
        return task;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setPlanState(String planState) {
        this.planState = planState;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setPlanBeginDate(String planBeginDate) {
        this.planBeginDate = planBeginDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public void setPlanFeedback(String planFeedback) {
        this.planFeedback = planFeedback;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", planName='" + planName + '\'' +
                ", planState='" + planState + '\'' +
                ", feedback='" + feedback + '\'' +
                ", planBeginDate='" + planBeginDate + '\'' +
                ", planEndDate='" + planEndDate + '\'' +
                ", planDescription='" + planDescription + '\'' +
                ", planFeedback='" + planFeedback + '\'' +
                ", taskId=" + taskId +
                ", task=" + task +
                '}';
    }
}
