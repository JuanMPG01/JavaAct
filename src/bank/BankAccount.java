package bank;

import javax.swing.JOptionPane;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountNumber, String accountHolderName, double InitialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = InitialBalance;
    }

    public void deposit(String amountInput) {

        try{
            double amount = Double.parseDouble(amountInput);

        if(amount <=0){
            JOptionPane.showMessageDialog(null, "Amount must be greater than 0");
        } else{
            balance += amount;
        }

        } catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Amount must be a number");
        }

    }
    public void withdraw(String amountInput) {
        try{
            double amount = Double.parseDouble(amountInput);

            if(amount <=0){
                JOptionPane.showMessageDialog(null, "Amount must be greater than 0");
            } else{
                balance -= amount;
            }

        } catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Amount must be a number");
        }
    }


    public double getBalance() {
        return balance;
    }


}