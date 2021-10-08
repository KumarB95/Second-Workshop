package com.bridgelabz;

public class AccountDetails {
    public float accountBalance;
    public float annualInterestRate;

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountDetails(float accountBalance, float annualInterestRate) {
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public float calculateAccountBalance() {
        float monthlyInterest=(annualInterestRate/12);
            accountBalance += (accountBalance * monthlyInterest);
        return accountBalance;
    }
}