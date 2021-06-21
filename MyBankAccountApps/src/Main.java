import za.ac.tut.Address.Address;
import za.ac.tut.BankAccountProcessor.BankAccountProcessor;
import za.ac.tut.accountHolder.AccountHolder;
import za.ac.tut.bankaccount.BankAccount;
import za.ac.tut.contactDetails.ContactDetails;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Declare Variables
        String acntNum = "";

        BankAccountProcessor ip = new BankAccountProcessor();
        List account = new ArrayList<>();

        //instatiate
      BankAccount[] accounts={new BankAccount(),new BankAccount(),new BankAccount("221230965",new AccountHolder("Tresor","Kwabezagwa",new Address(287,"Justice Mohammed","Sunnyside",0002)
              ,new ContactDetails("0624563896","tresor@gmail.com")),
              "Hard Account",8500)};
        //Display The details of all the accounts
        displayAccounts(accounts);

        //Increase the balance of all the accounts with random Nummbers
        ip.increaseBalance(accounts);

        //Display the accounts with random numbers
        System.out.println("Display The Accounts After being added with Random Numbers");
        displayAccounts(accounts);

        //WithDrawal Amount for a Specific amount
        ip.withdrawBalance(accounts,4000,"221230965");
        displayAccounts(accounts);

       //int index = ip.changeContactDetails(accounts, acntNum);
        //if (index == -1) {
          //  System.out.println("Account not found.");
        //} else {
            //change the information of the account holder
        }
        private static void displayAccounts(BankAccount[] accounts){
            for (int i = 0; i < accounts.length; i++) {
                BankAccount account = accounts[i];

                JOptionPane.showMessageDialog(null,"The Details of all the accounts are: " + "\n" +
                        "The BALANCE is R" + account.getBalance() + "\n" +
                        "The account Number is: " + account.getAccountNum() + "\n" +
                        "The name  : " + account.getAccountHolder().getName() + "\n" +
                        "The surname: " + account.getAccountHolder().getSurname() + "\n" +
                        "CellPhone: " + account.getAccountHolder().getContactDetails().getCellNo() + "\n" +
                        "Email Address: " + account.getAccountHolder().getContactDetails().getEmail() + "\n" +
                        "The Street number: " + account.getAccountHolder().getAddress().getStreetNum() + "\n" +
                        "The Street Name: " + account.getAccountHolder().getAddress().getStreetName() + "\n" +
                        "The Area Name: " + account.getAccountHolder().getAddress().getAreaName() + "\n" +
                        "The Area Code: " + account.getAccountHolder().getAddress().getCode(),"INFORMATION",JOptionPane.INFORMATION_MESSAGE) ;
            }
        }
  //  }
}