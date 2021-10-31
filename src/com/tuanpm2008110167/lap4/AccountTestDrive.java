package com.tuanpm2008110167.lap4;

public class AccountTestDrive {
 public static void main(String[] args) {
        Account account;
        account =  new Account(123,500);
        account.showData();
        account.deposit(500); 
        account.showData();
        account.withdraw(200);
        account.showData();
    }
    
}
