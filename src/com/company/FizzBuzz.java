package com.company;
import java.util.Random;
public class FizzBuzz {
    static String pr;
    Random rnd =new Random();

    public static void main(String[] args) {
        numPrint();
    }


    public static void numPrint() {
        Random rnd =new Random();
        int random1= rnd.nextInt(100)+1;
        int random2 = rnd.nextInt(100)+1;


        if (random1 == random2){
            pr="Sazam";
            print(pr);

        }
        else if (random1>random2) {
            int temp=random1;
            random1=random2;
            random2=temp;
            for (int i = random1; i <= random2; i++) {
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
    }

    public static void print(String pr) {
        System.out.println(pr);

    }
}

