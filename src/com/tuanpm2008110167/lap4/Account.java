package com.tuanpm2008110167.lap4;

public class Account {
    int number_account;
    int number_balance;
    Account(int a, int b){
        number_account = a;
        number_balance = b;
    }
    void showData(){
        System.out.println("number account: " + number_account );
        System.out.println("number balance: " + number_balance);
    }
    void deposit (int ammount){
        number_balance += ammount;
    }
    void withdraw (int ammount){
        number_balance -= ammount;
    }
}


    
