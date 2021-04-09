package com.company;

public class account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailadress;
    private String customerPhone;

    public account(int number, double balance, String customerName, String customerEmailadress, String customerPhone){
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmailadress=customerEmailadress;
        this.customerPhone=customerPhone;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit succesfull. new balance is="+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if ((this.balance - withdrawalAmount < 0)) {
            System.out.println("only " + this.balance + " available." + " Wihtdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal succesfull. new balance "+this.balance);
        }
        }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailadress() {
        return customerEmailadress;
    }

    public void setCustomerEmailadress(String customerEmailadress) {
        this.customerEmailadress = customerEmailadress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
