package com.bridgelabz;

public class AccountDetails {
    public int accountBalance;
    public float annualInterestRate;

    public AccountDetails(int accountBalance, float annualInterestRate) {

        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public float calculateAccountBalance() {
        float monthlyInterest=(annualInterestRate/12);
        for (int i=1;i<=12;i++) {
            accountBalance += (accountBalance * monthlyInterest);
            //System.out.printf("Account balance for %d month : %f",i,accountBalance);
        }
        //System.out.println("Total account balance is : "+accountBalance);
        return accountBalance;
    }
}