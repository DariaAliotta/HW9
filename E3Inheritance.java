package org.example.week9.d1.e3;

public class E3Inheritance {


    public static void main(String[] strings) {


        class BankAccount {
            String accountHolderName;
            String accountNumber;
            double balance;


            BankAccount(String accountHolderName, String accountNumber, double balance) {
                this.accountHolderName = accountHolderName;
                this.accountNumber = accountNumber;
                this.balance = balance;
            }


            void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited: $" + amount);
                }
            }


            void withdraw(double amount) {
                if (amount > 0) {
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrew: $" + amount);
                    }
                }
            }


            void printAccountInfo() {
                System.out.println("Account Holder: " + accountHolderName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance" + balance);
            }
        }

        class SavingsAccount extends BankAccount {
            double interestRate;

            SavingsAccount(String accountHolderName, String accountNumber, double balance) {
                super(accountHolderName, accountNumber, balance);
                this.interestRate = interestRate;
            }

            void applyInterest() {
                double interest;
                interest = balance * interestRate / 100;
                balance += interest;
                System.out.println("Interest applied: S " + interest);
            }
        }

        class CheckingAccount extends BankAccount {
            double overdraftLimit;

            CheckingAccount(String accountHolderName, String accountNumber, double balance) {
                super(accountHolderName, accountNumber, balance);
                this.overdraftLimit = overdraftLimit;
            }

            void withdraw(double amount) {
                if (amount <= 0) {
                    System.out.println("Your balance must be positive");
                } else if (balance - amount >= -overdraftLimit) {
                    super.withdraw(amount);
                    System.out.println("Balance: " + balance);
                }
            }

            }
        SavingsAccount theSavingsAccount = new SavingsAccount("John Doe", "123456789", 1050.0);
        theSavingsAccount.applyInterest();
        theSavingsAccount.printAccountInfo();

        CheckingAccount theCheckingAccount = new CheckingAccount("Jane Smith", "987654321", -50.0);
        theCheckingAccount.withdraw(25.0);
        theCheckingAccount.printAccountInfo();
        }
    }




