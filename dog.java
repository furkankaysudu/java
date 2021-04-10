package com.company;

public class dog extends animal{

    private int legs;
    private String coat;
    private int tail;
    private int ears;

    public dog(String name, int size, int weight,int legs, int tail, int ears, String coat) {
        super(name, size, 1, weight);
        this.coat=coat;
        this.ears=ears;
        this.tail=tail;
        this.legs=legs;
    }
    private void purpose(){
        System.out.println("this dog can be use as");
    }

}
