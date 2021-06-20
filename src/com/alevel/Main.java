package com.alevel;


public class Main {

    public static void main(String[] args) {

        System.out.println("С права на лево");
        int x = 347_693_485;
        while (x > 0) {
            int y = x % 10;
            if (y % 2 == 0 && y % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (y % 2 == 0) {
                System.out.println("Fizz");
            } else if (y % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(y);
            }
            x= x/10;
        }


        int a = 347_693_485;
        String bin = Integer.toBinaryString(a);
        int counter = 0;
        for (int i = 0; i < bin.length(); i++){
            if (bin.charAt(i) == 1) {
                counter++;
            }
        }

        System.out.println(counter);


    }
}