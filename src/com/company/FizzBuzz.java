package com.company;


public class FizzBuzz {
    static String pr;

    public static void main(String[] args) {
        numPrint();
    }

//creating method for the ligic
    public static void numPrint() {

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                pr = "FizzBuzz";
                print(pr);
            } else if (i % 3 == 0) {
                pr = "Fizz";
                print(pr);
            } else if (i % 5 == 0) {
                pr = "Buzz";
                print(pr);
            } else {
                pr = Integer.toString(i);
                print(pr);
            }
        }
    }
// method to  print message
    public static void print(String pr) {
        System.out.println(pr);

    }
}
