package com.company.oop;

class Calculation {
    int z;
    int a;
    public void addition(int x,int y,int a){
        z= x+y+a;
        System.out.println("Addition is: "+z);
    }
    public void subtraction(int x,int y)
    {
        z= x-y;
        System.out.println("Subtraction is:"+z);
    }
}


public class My_Calculation extends Calculation{
    int z;
    public void multiplication(int x,int y){
        z= x*y;
        int a=10;
        int b=20;
        int c=30;
        System.out.println("Product is:"+z);
        super.addition(a,b,c);
    }
    public void addition(int x,int y,int a) {
        z= x+y+a;
        System.out.println("Addition is :"+z);
    }
    public static void main(String[] args) {
	// write your code here
        My_Calculation temp= new My_Calculation();
        int a=10;
        int b=20;
        int c=30;
        temp.addition(a,b,c);
        temp.subtraction(a,b);
        temp.multiplication(a,b);
    }
}
