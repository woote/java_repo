package com.company.primes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeBruteDemo {

    public static void main(String[] args){
        Integer num=20;
        PrimesBrute primesBrute=new PrimesBrute(100);
        System.out.println(primesBrute);
        //primesBrute.getPrimesUptoNum(num);
        System.out.println(primesBrute.getPrimesUptoNum(50));
        PrimeFactorizer primeFactorizer=new PrimeFactorizer();
        List<Integer> list = primeFactorizer.getPrimeFactors(343);
        System.out.println(list);
        /*Scanner in= new Scanner(System.in);
        num= in.nextInt();
        primesBrute.getPrimesUptoNum(num);
        System.out.println(primesBrute.isPrime(num));
        primesBrute.numberOfPrimesLessThanNum(num);
        num=2*num;
        primesBrute.setQueryUpperLimit(num);
        System.out.println(primesBrute.upperlimit);
        primesBrute.getPrimesUptoNum(num);
        System.out.println(primesBrute.isPrime(num));
        primesBrute.numberOfPrimesLessThanNum(num);*/
    }
}
