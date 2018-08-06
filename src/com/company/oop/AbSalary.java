package com.company.oop;

import com.company.oop.AbEmployee;

public class AbSalary extends AbEmployee {
    private double salary;

    public AbSalary(String name,String address, int number, double salary){
        super(name,address,number);
        this.salary=salary;
    }
    public double getSalary() {
        return salary;
    }
    public void timepass(){
        System.out.println("Timepass done successfully.");
    }

    public void mailCheck(){
        System.out.println("Maling the check to concerned person with salary" + salary);
    }

}
