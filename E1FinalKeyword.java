package org.example.week9.d5.e1;

public class E1FinalKeyword {
    public static void main(String[] args) {

        class StringManipulator {
            String str;


            public StringManipulator(String str) {
                this.str = str;
            }

            public final String reverseString() {
                StringBuilder reversed = new StringBuilder(str);
                return reversed.reverse().toString();
            }


        }
        class ArrayManipulator {
            public final double avgElements(int[] array) {
                double sum = 0;
                for (int num : array) {
                    sum += num;
                }
                return sum / array.length;
            }
        }


        StringManipulator stringManipulator = new StringManipulator("hello");
        String reversedString = stringManipulator.reverseString();
        System.out.println(reversedString);

        ArrayManipulator arrayManipulator = new ArrayManipulator();
        int[] numbers = {3, 4, 5, 6, 6};
        double average = arrayManipulator.avgElements(numbers);
        System.out.println(average);
    }
        }


