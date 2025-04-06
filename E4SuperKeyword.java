package org.example.week9.d2.e4;

public class E4SuperKeyword {
    public static void main(String[] args) {

        class Animal{

            String sound;

            Animal(String sound){
                this.sound=sound;
            }
        }

        class Dog extends Animal{

            Dog(){
                super("Some generic animal sound");
                System.out.println("Bark");
            }

            void displaySound(){
                System.out.println(sound);
            }
        }
        Dog d1 = new Dog();
        d1.displaySound();
    }
}
