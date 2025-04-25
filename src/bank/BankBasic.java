package bank;

import javax.swing.*;

public class BankBasic{
    private BankAccount account;

    public void data(){
        String accountNumber = JOptionPane.showInputDialog("Enter account number");
        String accountName = JOptionPane.showInputDialog("Enter account name");
        double accountBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter initial balance"));
        account = new BankAccount(accountNumber, accountName, accountBalance);
        show();

    }

    private void show(){
        boolean opt = true;
        while (opt) {
            String[] options = {"Deposit", "Withdraw", "Check Balance", "Exit"};
            int slt = JOptionPane.showOptionDialog(null, "Select an option", "Bank Options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (slt) {
                case 0:
                    String depositAmount = String.valueOf(JOptionPane.showInputDialog("Enter deposit amount:"));
                    account.deposit(String.valueOf(depositAmount));
                    break;
                case 1:
                    String withdrawAmount = String.valueOf(JOptionPane.showInputDialog("Enter withdrawal amount:"));
                    account.withdraw(String.valueOf(withdrawAmount));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Current balance: " + account.getBalance());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    opt = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }

    public static void main(String[] args) {
        BankBasic B = new BankBasic();
        B.data();


    }
}
