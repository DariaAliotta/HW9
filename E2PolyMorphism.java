package org.example.week9.d5.e2;

public class E2PolyMorphism {
    public static void main(String[] args) {

         abstract class Shape{

           abstract double calculateArea();

            void displayArea(){
                System.out.println("The area of the shape is: " + String.format("%.2f", calculateArea()));
            }
        }
        class Circle extends Shape{

             private double radius;

             public Circle(double radius){
                 this.radius=radius;
             }
             @Override
             double calculateArea(){
                 return  Math.PI*radius*radius;
             }

             }

             class Rectangle extends Shape{

                 private double width;
                 private double height;

                 public Rectangle(double width, double height) {
                     this.width=width;
                     this.height=height;
                 }

                 @Override
                 double calculateArea(){
                     return  Math.PI*width*height;
                 }
             }

            Shape [] shapes={new Circle(5),new Rectangle(4,6)};

             for ( Shape shape : shapes ){
                 shape.displayArea();

            }
        }
    }

