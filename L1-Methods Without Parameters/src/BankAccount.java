import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    public static void main(String[] args) {
    withdrawl();
    }

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */

    public static void deposit(){

        double balance = Double.parseDouble( JOptionPane.showInputDialog("WHats yo current ballance?"));
        double deposit= Double.parseDouble(JOptionPane.showInputDialog("whats ur deposit?"));

        balance += deposit;

        JOptionPane.showMessageDialog(null, "youre new balance is: " + balance);



    }

    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */

    public static void withdrawl(){

        double balance = Double.parseDouble( JOptionPane.showInputDialog("WHats yo current ballance?"));
        double withdrawl= Double.parseDouble(JOptionPane.showInputDialog("whats ur withdrawl?"));

        balance -= withdrawl;

        JOptionPane.showMessageDialog(null, "youre new balance is: " + balance );
    }















}
