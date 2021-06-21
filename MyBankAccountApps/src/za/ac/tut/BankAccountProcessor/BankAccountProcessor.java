package za.ac.tut.BankAccountProcessor;

import za.ac.tut.bankaccount.BankAccount;

import javax.swing.*;
import java.util.List;

public class BankAccountProcessor {
    public BankAccountProcessor() {

    }

    public void increaseBalance(BankAccount[] bankAccounts) {
        BankAccount bankAccount;
        double balance;

        for (int i = 0; i < bankAccounts.length; i++) {
            //get balance at index
            bankAccount = bankAccounts[i];

            //get the balance
            balance = bankAccount.getBalance();

            //increase the balance
            balance = balance + (500 + Math.floor(Math.random() * 500));

            //set the new balance
            bankAccount.setBalance(balance);

            //store it back in the array
            bankAccounts[i] = bankAccount;
        }
    }

    public void withdrawBalance(BankAccount[] bankAccounts, double withdrawalAmount,String acntNum) {
        double balance;
        BankAccount account;
        for (int i = 0; i < bankAccounts.length; i++) {

            //get bank account  at index
            account = bankAccounts[i];
            //get the account Number
            acntNum = account.getAccountNum();
            //get the balance
            balance = account.getBalance();


            if (acntNum == account.getAccountNum()) {

                if (balance >= withdrawalAmount) {
                    //update the balance by decrementing
                    account.setBalance(balance -= withdrawalAmount);
                } else {
                    JOptionPane.showMessageDialog(null, "The account Number was not found ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

     //  public int changeContactDetails(BankAccount[] bankAccounts,String acntNum){
       //     int i = 0;
          //  while ((i < bankAccounts.size()) && (((BankAccount) bankAccounts.get(i)).getAccountNum() != acntNum)) {
               // i++;
            //}
            //if (i == bankAccounts.size()) {
              //  i = -1;
            //}
            //return i;
        //}

    }
    }

