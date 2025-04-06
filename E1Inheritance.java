package org.example.week9.d1.e1;

public class E1Inheritance {

    public static void main(String[] args) {

        class Vehicle{
        String make;
        int year;

        Vehicle(String make, int year){
            this.make=make;
            this.year=year;
        }
        void displayInfo(){
            System.out.println("Vehicle: " + make + " Year: " + year);
        }
        }

        class Car extends Vehicle{
            String model;

            Car(String make, int year, String model) {
                super(make, year);
                this.model = model;
            }

            void displayCarInfo(){
                displayInfo();
                System.out.println("Model: " + model);
            }
        }



        Car theCar=new Car("Toyota", 2020,"Corolla");
        theCar.displayCarInfo();


    }
    }




