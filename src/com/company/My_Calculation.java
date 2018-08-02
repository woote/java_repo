package com.company;

public class My_Calculation extends Calculation{
    int z;
    public void multiplication(int x,int y){
        z= x*y;
        System.out.println("Product is:"+z);
    }
    public static void main(String[] args) {
	// write your code here
        My_Calculation temp= new My_Calculation();
        int a=10;
        int b=20;
        temp.addition(a,b);
        temp.subtraction(a,b);
        temp.multiplication(a,b);
    }
}
