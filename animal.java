package com.company;

public class animal {
    private String name;
    private int size;

    public animal(String name, int size, int brain, int weight) {
        this.name = name;
        this.size = size;
        this.brain = brain;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("it worked");
    }
    public void move(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int brain;
    private int weight;
}
