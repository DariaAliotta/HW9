package org.example.week9.d4.e4;

public class E4MethodOverloading {
    public static void main(String[] args) {

        class BankAccount{

            void  displayInfo(){
                System.out.println("private displayInfo method");
            }

            private void  displayInfo(int balance){
                System.out.println("private displayInfo method with balance: " + balance);
            }

            static void displayBankInfo(){
                System.out.println("static method without parameter");
            }

            static void displayBankInfo(int balance){
                System.out.println("static method with int parameter: " + balance);
            }
        }

        BankAccount accountInfo= new BankAccount();
        accountInfo.displayInfo();
        accountInfo.displayInfo(5000);
        accountInfo.displayBankInfo();
        accountInfo.displayBankInfo(20);


    }
}


