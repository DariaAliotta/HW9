package org.example.week9.d2.e2;

public class E2SuperKeyword {
    public static void main(String[] args) {


        class Vehicle {

            Vehicle() {
                System.out.println("This is the Vehicle constructor");
            }

            class Car extends Vehicle {

                Car() {
                    super();
                }
            }


        }

        Vehicle theCar= new Vehicle();

    }
}
