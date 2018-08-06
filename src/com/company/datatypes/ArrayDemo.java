package com.company.datatypes;

import com.sun.istack.internal.NotNull;

import java.util.Date;

public class ArrayDemo {
    public static void main(String [] args){
        Date today= new Date();
        System.out.println(today.toString());
        Array array=new Array();
        array.generatePrimes();
    }
}
