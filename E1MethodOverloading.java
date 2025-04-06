package org.example.week9.d4.e1;

public class E1MethodOverloading {


    public static void main(String[] args) {

        class TransactionCalculator {

            int transaction1;
            int transaction2;
            int transaction3;
            int transaction4;
            int cost;

            int calculateProfit(int transaction1, int transaction2) {
                return transaction1 - transaction2;

            }

            int calculateProfit(int transaction1, int transaction2, int transaction3) {
                return transaction1 - transaction2 - transaction3;
            }

            int calculateProfit(int transaction1, int transaction2, int transaction3, int transaction4) {
                return transaction1 - transaction2 - transaction3 - transaction4;
            }
        }

        TransactionCalculator calculator2= new TransactionCalculator();
        int profit3=calculator2.calculateProfit(100,20,30,10);
        System.out.println(profit3);

        TransactionCalculator calculator1= new TransactionCalculator();
        int  profit2=calculator1.calculateProfit(80, 30,20);
        System.out.println(profit2);

        TransactionCalculator calculator = new TransactionCalculator();
            int profit1 = calculator.calculateProfit(50, 30);
            System.out.println(profit1);

        }

      }




