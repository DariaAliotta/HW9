package org.example.week9.d2.e1;

public class E1SuperKeyword {
    public static void main(String[] args) {

        class Building{
            String location;

            Building(String location){
                this.location=location;
                System.out.println(location);
            }

            Building() {
                System.out.println("Building Constructor");
            }


        }

        class House extends Building{

            House(String location){
                super(location);
            }

        }

            House theHouse = new House("Vienna");


    }
}

