package ch2_Factorial;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n = ");
        int n = sc.nextInt();

        long beforeTime = System.currentTimeMillis();
        int result = fib(n);
        long afterTime = System.currentTimeMillis();
        System.out.println("Factorial n = " + result);
        System.out.println("Execution Time = " + (afterTime - beforeTime));
    }

    static int fib(int n) {
        System.out.println("Calling fibo(" + n + ")");
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
