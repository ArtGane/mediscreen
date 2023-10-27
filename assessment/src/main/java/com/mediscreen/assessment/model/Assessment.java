package com.mediscreen.assessment.model;

import org.springframework.context.annotation.ComponentScan;

public class Assessment {

    private Long patId;
    private int age;
    private String riskLevel;

    public Assessment(Long patId, int age, String riskLevel) {
        this.patId = patId;
        this.age = age;
        this.riskLevel = riskLevel;
    }

    public Long getPatId() {
        return patId;
    }

    public void setPatId(Long patId) {
        this.patId = patId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
