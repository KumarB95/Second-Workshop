package com.bridgelabz.savingAccount;
import java.util.ArrayList;
/*
* Program : Calculating monthly balance
* Author : Navalkumar Balingal
* Date : 08/10/2021
* */

public class SavingsAccount {

    public static void main(String[] args) {
        System.out.println("Welcome to Banking application");

        AccountDetails accountDetails1=new AccountDetails(2000,4);
        float balanceFirstMonthSaver1=accountDetails1.calculateAccountBalance();
        System.out.println("Account balance for saver 1 Rs for interest rate 4% : "+balanceFirstMonthSaver1);

        AccountDetails accountDetails2=new AccountDetails(3000,4);
        float balanceFirstMonthSaver2=accountDetails2.calculateAccountBalance();
        System.out.println("Account balance for saver 2 Rs for interest rate 4% : "+balanceFirstMonthSaver2);

        int modifyInterestRate=5;
        AccountDetails accountDetails3=new AccountDetails(balanceFirstMonthSaver1,modifyInterestRate);
        System.out.println("Account balance next month for saver 1 Rs for interest rate 5% : "+
                            accountDetails3.calculateAccountBalance());

        AccountDetails accountDetails4=new AccountDetails(balanceFirstMonthSaver2,modifyInterestRate);
        System.out.println("Account balance next month for saver 2 Rs for interest rate 5% : "+
                            accountDetails4.calculateAccountBalance());
    }
}
