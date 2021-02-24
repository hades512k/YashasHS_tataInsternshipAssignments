package com.tata.internship.assignment1_2;

public class SalariedWorker extends Worker{

    SalariedWorker(String name,float salaryRate){
        super(name,salaryRate);
    }
    
    float pay() {
        return super.pay(40);
    }
}
