package com.tata.internship.assignment1_2;

public class WorkerMain {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("Alice",100);
        SalariedWorker salariedWorker = new SalariedWorker("Bob",150);

        System.out.println("Daily worker's weekly salary for 50 hours is : "+dailyWorker.pay(40));
        System.out.println("Daily worker's weekly salary for one week is : "+salariedWorker.pay());
    }
}
