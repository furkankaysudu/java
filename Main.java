package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        account ilkHesap = new account(12345,500,"ali","@ali","0212");
        ilkHesap.withdrawal(100);
        ilkHesap.deposit(50);


    }
}
