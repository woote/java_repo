package com.company.datatypes;

import com.sun.istack.internal.NotNull;

public class Array extends ArrayDemo{
    //Store prime numbers in an array brute force
    private Integer[] primes;
    private Double[] dprimes;
    public void generatePrimes(){
        primes= new Integer[100];
        dprimes= new Double[100];
        setArray(primes,dprimes);
        printAny(getIntArray());
        printAny(getDoubleArray());
        try {
            for (Integer a : primes) {
                if (a != null) {
                    System.out.print(a);
                    System.out.print(" ");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void setArray(Integer[] primes, Double[] dprimes){
        int ct;
        int ind=0;
        for(int i=2;i<100;i++){
            ct=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    ct++;
                }
            }
            if(ct==1){
                primes[ind]=i;
                dprimes[ind]=primes[ind]/2.0;
                ind++;
            }
        }
    }
    public Integer[] getIntArray(){
        return primes;
    }
    public Double[] getDoubleArray(){
        return dprimes;
    }
    public void printArray(@NotNull int[] array) {
        for(int i=0;i<array.length;i++) {
            if (array[i] != 0) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
    }
    //Generic types
    public <E> void printAny(@NotNull E[] array){
        for(E element: array) {
            if (element != null) {
                System.out.print(element);
                System.out.print(" ");
            }
        }
        System.out.println("\n");
    }
}
