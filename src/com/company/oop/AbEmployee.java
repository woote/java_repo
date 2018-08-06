package com.company.oop;

public abstract class AbEmployee {
    private String name;
    private String address;
    private int number;

    public AbEmployee(String name,String address, int number){
        this.name= name;
        this.address= address;
        this.number=number;
    }
    public abstract void timepass();
    //{
        // abstract methods cannot have body. System.out.println("I feel like doing tp");
    //}
    public void mailCheck(){
        System.out.println("Mailing the check to: "+this.name+ " "+this.address);
    }
    public double computePay(){
        System.out.println("Inside AbEmployee computePay()");
        return 0.0;
    }
    public String toString(){
        return name+" "+address+" "+number;
    }
    public void setNewAddress(String address1) {
        address=address1;
    }
    public String getAddress() {
        return address;
    }
    public int getNumber(){
        return number;
    }

    public String getName() {
        return name;
    }
}
