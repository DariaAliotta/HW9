package org.example.week9.d6.e1;

public class E1AbstractClass {
    public static void main(String[] args){

        abstract class Vehicle{

             abstract void startEngine();
             void stopEngine(){
                System.out.println("Vehicle engine stopped");
            }
        }

        class Car extends Vehicle {

            @Override
            void startEngine() {
                System.out.println("Car engine started");
            }


        void startEngine( String keyType){
            System.out.println("Car engine started with" + keyType);
        }
        }
        Car myCar=new Car();
        myCar.startEngine();
        myCar.startEngine(" a smart key");
        myCar.stopEngine();
    }
}


