package com.bridgelabz;

public class AccountDetails {
    private float savingsBalance;
    private float annualInterestRate;

    public float getAccountBalance() {
        return savingsBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.savingsBalance = accountBalance;
    }

    public AccountDetails(float accountBalance, float annualInterestRate) {
        this.savingsBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public float calculateAccountBalance() {
        float monthlyInterest=((annualInterestRate/12)/100);
        savingsBalance += (savingsBalance * monthlyInterest);
        return savingsBalance;
    }
}