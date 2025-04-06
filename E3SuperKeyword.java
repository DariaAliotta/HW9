package org.example.week9.d2.e3;

public class E3SuperKeyword {
    public static void main(String[] args) {

        class Appliance {

            //int wattage;

            Appliance() {
                System.out.println("Appliance Constructor without argument");
            }

            Appliance(int wattage) {
                System.out.println("Wattage: " + wattage);
            }
        }

            class WashingMachine extends Appliance {

                int capacity;

                WashingMachine() {
                    super();
                    System.out.println("WashingMachine Constructor without argument");
                }


                WashingMachine(int wattage, int capacity) {
                    super(wattage);
                    this.capacity = capacity;
                    System.out.println("Capacity: " + capacity);
                }
            }
        WashingMachine wm= new WashingMachine();
        WashingMachine wm2=new WashingMachine(500, 7);
        }
    }



