package org.example.week9.d6.e3;

public class E3AbstractClass {
    public static void main(String[] args){

        abstract class Animal{

            abstract void makeSound();



            abstract void move();

        }

        class Dog extends Animal{

            @Override
            void makeSound(){
                System.out.println("The Dog makes sound by Barking");
            }

            @Override
           void  move(){
                System.out.println("The Dog moves by Running");
            }
        }

        class Bird extends Animal{

            @Override
            void makeSound(){
                System.out.println("The Bird makes sound by Chirping");
            }

            @Override
            void move(){
                System.out.println("The Bird moves by Flying");
            }
        }
        Dog myDog=new Dog();
        myDog.makeSound();
        myDog.move();

        Bird myBird=new Bird();
        myBird.makeSound();
        myBird.move();


    }
}


