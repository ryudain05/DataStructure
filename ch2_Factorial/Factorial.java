package ch2_Factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n = ");
        int n = sc.nextInt();

        long beforeTime = System.currentTimeMillis();
        int result = fact(n);
        long afterTime = System.currentTimeMillis();

        System.out.println("Factorial = " + result);
        System.out.println("Execution Time = " + (afterTime - beforeTime));
    }


    static int fact(int n) {
        System.out.println("Calling Factorial(" + n + ")");
        if (n <= 0) return 1;
        else return n * fact(n - 1);
    }
}
