package org.example.week9.d4.e6;

public class E6MethodOverriding {
    public static void main(String[] args) {

        class Animal {
            String type;

            public Animal(String type) {
                this.type = type;
            }

            public void eat() {
                System.out.println("I am an animal eating");
            }

            protected void sleep() {
                System.out.println("I am an animal sleeping");
            }

            void makeSound() {
                System.out.println("I am an animal making sound");
            }

            private void roam() {
                System.out.println("I am an animal roaming");
            }
        }

        class Cat extends Animal {
            public Cat() {
                super("Cat");
            }

            @Override
            public void eat() {
                System.out.println("Cat eats");
            }

            @Override
            protected void sleep() {
                System.out.println("Cat sleeps a lot");
            }

            @Override
            void makeSound() {
                System.out.println("Cat makes a sound");
            }
        }

        class Kitten1 extends Cat {
            @Override
            public void eat() {
                System.out.println("kitten1 eats milk");
            }

            @Override
            protected void sleep() {
                System.out.println("kitten1 sleeps a lot");
            }
        }

        class Kitten2 extends Cat {
            @Override
            public void eat() {
                System.out.println("kitten2 eats snacks");
            }

            @Override
            protected void sleep() {
                System.out.println("kitten2 sleeps a lot");
            }
        }

        class Kitten3 extends Cat {
            @Override
            public void eat() {
                System.out.println("kitten3 eats everything");
            }

            @Override
            protected void sleep() {
                System.out.println("kitten3 sleeps a lot");
            }
        }

                Animal[] animals = {
                        new Cat(),
                        new Kitten1(),
                        new Kitten2(),
                        new Kitten3()
                };

                for (Animal animal : animals) {
                    animal.eat();
                    animal.sleep();
                }

                Cat cat = new Cat();
                cat.makeSound();
            }
        }



