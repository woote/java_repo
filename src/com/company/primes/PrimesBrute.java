package com.company.primes;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimesBrute implements PrimeUtil{
    private int upperlimit=0;
    private Set<Integer> listofprimes;
    public PrimesBrute(){
        listofprimes= new HashSet<>();
    }

    private boolean disivsorExists(final int evalNum){
        return IntStream.range(2, (int)Math.ceil(Math.sqrt(evalNum))).mapToObj(x -> evalNum % x == 0).reduce((a, b)->a|b).orElse(false);
    }

    public PrimesBrute(int upperLimit){
        this();
        IntStream.range(2, upperLimit)
                .forEach(
                        x-> {
                            if(!disivsorExists(x))
                                listofprimes.add(x);
                        });
        /*for(int i = 2; i<= upperLimit; i++){
//            boolean divisorFound =false;
            final int evalNum = i;
            boolean divisorFound  = ;
//            for(int j=2;j<=Math.ceil(Math.sqrt(i));j++)
//                if(i%j==0)
//                    divisorFound=true;
            if(!divisorFound)
                listofprimes.add(i);
        }*/
    }

    @Override
    public boolean isPrime(Integer num) {
        return listofprimes.contains(num);
    }

    @Override
    public String toString(){
        return listofprimes.stream().map(x-> x+" ").reduce((x,y)->x+y).get();
    }

    @Override
    public void setQueryUpperLimit(int upperlimit) {
        this.upperlimit=upperlimit;
    }

    @Override
    public int numberOfPrimesLessThanNum(int num) {
        return getPrimesUptoNum(num).size();
    }
    @Override
    public List<Integer> getPrimesUptoNum(final int num) {
        return listofprimes.stream().filter(curPrime->(curPrime<num)).collect(Collectors.toList());
    }

    @Override
    public int getLeastPrimeDivisor(int num) throws Exception {
        //Collections.sort(listofprimes);
        return listofprimes.stream().sorted().filter(curPrime-> (num%curPrime==0)).findFirst().orElseThrow(Exception::new);
    }
}
