package com.company.oop;

//virtual method invocation
//concept- at compile time the compiler checks for the method in the class defination but at run time it can override the method
//if possible i.e if the method is present in the subclass.

// https://stackoverflow.com/questions/11431185/what-is-the-use-of-java-virtual-method-invocation

import java.util.ArrayList;

public class VirtualDemo {

    public static void main(String [] args) {
        Salary s = new Salary("Ram Vaswani","Agra, UP",1, 1000);
        Employee e = new Salary("Ethan Hunt", "Ratlam, MP", 2, 1000000.00);
        System.out.println("Call mailCheck using Salary reference: ");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference: ");
        e.mailCheck();
        ArrayList<Employee> objs= new ArrayList<Employee>();
        objs.add(s);
        objs.add(e);
        printObjects(objs);
    }

    public static void printObjects(ArrayList<Employee> objs)
    {
        //polymorphism
        for(Employee o: objs){
            System.out.println(o.toString());
        }
    }
}
