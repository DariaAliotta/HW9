package org.example.week9.d6.e2;


public class E2AbstractClass {

    public static void main(String[] args){

        abstract class Shape {

            protected String shapeName;

            public Shape(String shapeName) {
                this.shapeName = shapeName;
            }

            abstract void calculateArea();
            abstract void calculatePerimeter();

            void displayName() {
                System.out.println("The name of the shape is: " + shapeName);
            }
        }

        class Rectangle extends Shape {

            double width;
            double height;

            Rectangle(double width, double height) {
                super("Rectangle");
                this.width = width;
                this.height = height;
            }

            @Override
            void calculateArea() {
                double area = height * width;
                System.out.printf("Area of Rectangle is %.2f%n", area);
            }

            @Override
            void calculatePerimeter() {
                double perimeter = 2 * (height + width);
                System.out.printf("Perimeter of Rectangle is %.2f%n", perimeter);
            }
        }

        class Circle extends Shape {

            private double radius;
            final double PI = Math.PI;

            Circle(double radius) {
                super("Circle");
                this.radius = radius;
            }

            @Override
            void calculateArea() {
                double area = PI * radius * radius;
                System.out.printf("Area of Circle is %.2f%n", area);
            }

            @Override
            void calculatePerimeter() {
                double perimeter = 2 * PI * radius;
                System.out.printf("Perimeter of Circle is %.2f%n", perimeter);
            }

        }

        Shape rectangle = new Rectangle(6, 4);
        rectangle.displayName();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Shape circle = new Circle(5);
        circle.displayName();
        circle.calculateArea();
        circle.calculatePerimeter();

    }
}