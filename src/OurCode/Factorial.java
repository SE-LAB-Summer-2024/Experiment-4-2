package OurCode;

import java.util.Scanner;
import java.util.Random;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate Factorials of the numbers between 1 to : ");
        long fac = scanner.nextLong();
        for(int i = 1; i <= fac; i ++) {
            System.out.println(i + ":");
            showFactorial(i, i - 1);
            delay();
        }

    }


//    private static void delay() {
//        int [][] arr = new int[10000][10000];
//        for (int i = 0; i < 10000; i++) {
//            for (int j = 0; j < 10000; j++) {
//                for (int k = 0; k < 100; k++) {
//                    arr[i][j] = i * j + k ;
//                }
//            }
//        }
//    }

    private static void delay() {
        Random rand = new Random();
        for (int i = 0; i < 100000000; i++) {
            int b = rand.nextInt();

        }
    }

    public static void showFactorial(long fac, long next){
        if (next == 1 || next == 0) {
            System.out.println("Result : " + fac);
        } else
            showFactorial(fac * next , next - 1);
    }

}
