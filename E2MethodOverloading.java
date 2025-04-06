package org.example.week9.d4.e2;

public class E2MethodOverloading {
    public static void main(String[] args){


        class LoanPaymentCalculator{

            double calculatePayment(double loanAmount, double interestRate ) {
                return (loanAmount * (1 + interestRate / 100)) / 12;
            }


            double calculatePayment(double loanAmount, double interestRate, double numberOfMonths){
                return (loanAmount * (1 + interestRate / 100)) / numberOfMonths;

            }


            double calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment){
                return (((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths);
            }
        }

        LoanPaymentCalculator calculator= new LoanPaymentCalculator();

        double result1= calculator.calculatePayment(10000, 5);
        System.out.printf("%.2f%n", result1);

        double result2=calculator.calculatePayment(10000, 5, 24);
        System.out.printf("%.2f%n", result2);

        double result3=calculator.calculatePayment(10000, 5, 24,2000);
        System.out.printf("%.2f%n", result3);



    }
}

