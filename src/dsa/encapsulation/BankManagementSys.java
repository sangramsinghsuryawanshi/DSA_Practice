package dsa.encapsulation;

import java.util.Scanner;

/*
Requirements
Account Number
Account Holder Name
Balance (private)
Deposit amount must be greater than 0.
Withdrawal amount cannot exceed the available balance.
Display the current balance after every successful transaction.
 */
public class BankManagementSys {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Bank Account");
            System.out.println("2. Show Account Details");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    bank.setAccountHolderName(input.nextLine());

                    System.out.print("Enter Account Number: ");
                    bank.setAccountNumber(input.nextLong());

                    System.out.print("Enter Initial Balance: ");
                    bank.setAccountBalance(input.nextDouble());

                    System.out.println("Account Created Successfully.");
                    break;

                case 2:
                    System.out.println("\nAccount Holder : " + bank.getAccountHolderName());
                    System.out.println("Account Number : " + bank.getAccountNumber());
                    System.out.println("Balance        : " + bank.getAccountBalance());
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();

                    if (withdraw > 0 && withdraw <= bank.getAccountBalance()) {
                        bank.setAccountBalance(bank.getAccountBalance() - withdraw);
                        System.out.println("Withdrawal Successful.");
                        System.out.println("Current Balance: " + bank.getAccountBalance());
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();

                    if (deposit > 0) {
                        bank.setAccountBalance(bank.getAccountBalance() + deposit);
                        System.out.println("Deposit Successful.");
                        System.out.println("Current Balance: " + bank.getAccountBalance());
                    } else {
                        System.out.println("Invalid Deposit Amount.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        input.close();
    }
}

class Bank {

    private String accountHolderName;
    private long accountNumber;
    private double accountBalance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}