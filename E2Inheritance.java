package org.example.week9.d1.e2;

public class E2Inheritance {

    static class Person {
        private String name;
        private String lastName;
        private int age;

        Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        void printPersonDetails() {
            System.out.println(name + " " + lastName + " " + age);
        }
    }

    static class Employee extends Person {
        private int salary;

        public Employee(String name, String lastName, int age, int salary) {
            super(name, lastName, age);
            this.salary = salary;
        }

        void printEmployeeDetails() {
            printPersonDetails();
            System.out.println(salary);
        }
    }

    static class Student extends Person {
        private int grade;

        Student(String name, String lastName, int age, int grade) {
            super(name, lastName, age);
            this.grade = grade;
        }

        void printStudentDetails() {
            printPersonDetails();
            System.out.println(grade);
        }
    }

    static class Retiree extends Person {
        private String seniorActivity;

        Retiree(String name, String lastName, int age, String seniorActivity) {
            super(name, lastName, age);
            this.seniorActivity = seniorActivity;
        }

        void printRetireeDetails() {
            printPersonDetails();
            System.out.println(seniorActivity);
        }
    }

    public static void main(String[] args) {
        Employee theEmployee = new Employee("Joe", "Smith", 35, 35000);
        theEmployee.printEmployeeDetails();

        Student theStudent = new Student("Adam", "Smith", 15, 10);
        theStudent.printStudentDetails();

        Retiree theRetiree = new Retiree("Frank", "Smith", 15, "tour");
        theRetiree.printRetireeDetails();
    }
}


