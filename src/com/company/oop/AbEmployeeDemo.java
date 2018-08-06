package com.company.oop;

public class AbEmployeeDemo {
    public static void main(String[] args){
        // this wont work- AbEmployee abe= new AbEmployee("try","try", 1);
        AbEmployee abe=new AbSalary("try", "try", 1, 5000);
        System.out.println("Mailing check to ");//
        abe.mailCheck();
    }
}
