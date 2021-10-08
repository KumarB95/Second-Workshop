package com.bridgelabz;
import java.util.ArrayList;


public class SavingsAccount {

    public static void main(String[] args) {
        System.out.println("Welcome to Banking application");


        AccountDetails accountDetails1=new AccountDetails(2000,4);
        System.out.println("Account balance for saver 1 Rs for interest rate 4%:"+accountDetails1.calculateAccountBalance());
        AccountDetails accountDetails2=new AccountDetails(3000,4);
        System.out.println("Account balance for saver 2 Rs for interest rate 4%:"+accountDetails2.calculateAccountBalance());

        AccountDetails accountDetails3=new AccountDetails(2000,5);
        System.out.println("Account balance for saver 1 Rs for interest rate 5%:"+accountDetails3.calculateAccountBalance());
        AccountDetails accountDetails4=new AccountDetails(3000,5);
        System.out.println("Account balance for saver 2 Rs for interest rate 5%:"+accountDetails4.calculateAccountBalance());
    }
}
