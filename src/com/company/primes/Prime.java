package com.company.primes;

import java.util.List;

interface PrimeUtil{
    boolean isPrime(Integer num);
    void setQueryUpperLimit(int max);
    int getLeastPrimeDivisor(int num) throws Exception;
    int numberOfPrimesLessThanNum(int num);
    List<Integer> getPrimesUptoNum(int num);
}
