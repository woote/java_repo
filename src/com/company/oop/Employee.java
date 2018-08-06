package com.company.oop;

public class Employee {
    public String name;
    public String address;
    public int number;

    public Employee(String name, String address, int number){
        System.out.println("Employee constructor called");
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public void mailCheck(){
        System.out.println("Mailing a check to ");
    }
    public String toString(){
        return name+" "+address+" "+number;
    }
    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getNumber(){
        return number;
    }
}

