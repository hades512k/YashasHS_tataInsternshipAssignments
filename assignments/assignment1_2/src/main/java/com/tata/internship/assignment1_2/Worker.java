package com.tata.internship.assignment1_2;

public class Worker {
    protected String  name;
    protected float salaryRate;

    Worker(String name,float salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public void setSalaryRate(float salaryRate){
        this.salaryRate = salaryRate;
    }

    public void setName(String name){
        this.name = name;
    }

    float pay(int hours){
        return salaryRate*hours;
    }
}
