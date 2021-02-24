package com.tata.internship.assignment1_2;

public class DailyWorker extends Worker{

    DailyWorker(String name, float salaryRate){
        super(name,salaryRate);
    }

    @Override
    float pay(int hours) {
        return super.pay(hours);
    }
}

