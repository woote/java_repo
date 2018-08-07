package com.company.primes;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizer {
    public List<Integer> getPrimeFactors(int num){
        PrimesBrute primesBrute= new PrimesBrute(num);
        List<Integer> list =new ArrayList<>();
        try{
            while (true){
                int factor = primesBrute.getLeastPrimeDivisor(num);
                list.add(factor);
                System.out.println(factor);
                num/=factor;
            }
        }catch (Exception e){}
        return list;
    }
}
