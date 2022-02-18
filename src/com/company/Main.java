package com.company;

class Account{

    protected double balance;

    public void Withdraw(double amount) {
        balance -= amount;
    }
    public void Deposit(double amount) {
        balance += amount;
    }
    public void printBalance(){
        System.out.println(balance);
    }

}

class Saving extends Account{

    private double interestRate = 0.8;

    // saving constructor
    public Saving(double balance){
        this.balance = balance;
    }

    public void Withdraw(double amount){
        balance -= amount*interestRate; // with interest rate***
    }
    public void Deposit(double amount) {
        balance += amount + amount*interestRate; // with interest rate***
    }
    public void printBalance(){
        System.out.println(super.balance);
    }
}

class Current extends Account{

    // current constructor
    public Current(double balance){
        this.balance = balance;
    }

    public void Withdraw(double amount){
        balance -= amount;
    }
    public void Deposit(double amount){
        balance += amount;
    }
    public void printBalance(){
        System.out.println(super.balance);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("balance before withdrawing from saving account");
        Account sav = new Saving(5000);
        sav.printBalance();

        sav.Withdraw(2000);

        System.out.println("balance after withdrawing from the saving account.");
        sav.printBalance();

        System.out.println();

        System.out.println("Balance before withdrawing from the current account");
        Account cur = new Current(5000);
        cur.printBalance();

        cur.Withdraw(1500);

        System.out.println("Balance after withdrawing from the current account.");
        cur.printBalance();

    }
}
