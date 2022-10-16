package com.PPlabs.lr1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = getCount(args);

        if (n < 0){
            System.out.println("Error, invalid input!");
            return;
        }

        putCorrectNum(n);
    }

    public static boolean isSquare(long num){
        return Math.sqrt(num) % 1 == 0;
    }

    public static int getCount(String[] args){

        if (args.length == 0){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter N, the number of prime numbers : ");
            return scan.nextInt();
        }
        else return Integer.parseInt(args[0]);
    }

    public static void putCorrectNum(int n){

        System.out.println("Lucas numbers, that are squares :");

        LucasNumber lucasNumber = new LucasNumber();
        long num;
        boolean isSqr = false;

        for (int i = 0; i <= n; i++){
            num = lucasNumber.getNum(i);
            if (isSquare(num)){
                System.out.print(num + " ");
                isSqr = true;
            }
        }

        if (!isSqr){
            System.out.println("None of the N prime numbers is a square");
        }
    }
    /*public static long getNum(int position){

        long position0 = 2;
        long position1 = 1;

        if (position == 1)
            return 1;
        if (position == 0)
            return 2;

        long numPosition = position0;

        for (int i = 2; i <= position; i++){
            numPosition = position0+position1;
            position0 = position1;
            position1 = numPosition;
        }

        return numPosition;
    }*/
}
