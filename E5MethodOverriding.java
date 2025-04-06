package org.example.week9.d4.e5;

import javax.net.ssl.ManagerFactoryParameters;

public class E5MethodOverriding {
    public static void main(String[] args) {

         class Employee {
            public void work() {
                System.out.println("I am an Employee working");
            }

            protected void takeBreak() {
                System.out.println("I am an Employee taking a break");
            }

            void attendMeeting() {
                System.out.println("I am an Employee attending a meeting");
            }

            private void submitReport() {
                System.out.println("I am an Employee submitting a report");
            }

            public void hello() {
                System.out.println("method in Employee class");
            }
        }


         class Manager extends Employee {
            @Override
            public void work() {
                System.out.println("I am a Manager working");
            }

            @Override
            protected void takeBreak() {
                System.out.println("I am a Manager taking a break");
            }

            @Override
            void attendMeeting() {
                System.out.println("I am a Manager attending a meeting");
            }

            @Override
            public void hello() {
                System.out.println("method in Manager class");
            }
        }


         class Developer extends Employee {
            @Override
            public void work() {
                System.out.println("I am a Developer working");
            }

            @Override
            protected void takeBreak() {
                System.out.println("I am a Developer taking a break");
            }

            @Override
            void attendMeeting() {
                System.out.println("I am a Developer attending a meeting");
            }

            @Override
            public void hello() {
                System.out.println("method in Developer class");
            }
        }


         class Intern extends Employee {
            @Override
            public void work() {
                System.out.println("I am an Intern working");
            }

            @Override
            protected void takeBreak() {
                System.out.println("I am an Intern taking a break");
            }

            @Override
            void attendMeeting() {
                System.out.println("I am an Intern attending a meeting");
            }

            @Override
            public void hello() {
                System.out.println("method in Intern class");
            }
        }



                Employee[] employees = {
                        new Manager(),
                        new Developer(),
                        new Intern()
                };

                for (Employee emp : employees) {
                    emp.hello();
                }


                Developer dev = new Developer();
                dev.work();
                dev.takeBreak();
                dev.attendMeeting();
            }
        }












