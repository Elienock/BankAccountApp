package za.ac.tut.bankaccount;

import za.ac.tut.accountHolder.AccountHolder;

public class BankAccount {
    private String accountNum;
    private AccountHolder accountHolder;
    private String typeOfAcc;
    private double balance;

    public BankAccount(){
        this.accountNum="225678944";
        this.accountHolder=new AccountHolder();
        this.typeOfAcc="Easy Account";
        this.balance=90000;
    }
    public BankAccount(String accountNum,AccountHolder accountHolder,String typeOfAcc,double balance){
        this.accountNum=accountNum;
        this.accountHolder=accountHolder;
        this.typeOfAcc=typeOfAcc;
        this.balance=balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public String getTypeOfAcc() {
        return typeOfAcc;
    }

    public double getBalance() {
        return balance;
    }


    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setTypeOfAcc(String typeOfAcc) {
        this.typeOfAcc = typeOfAcc;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
