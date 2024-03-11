package ch2_Factorial;

import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 2, c = 3;

        System.out.print("Input n = ");
        int n = sc.nextInt();

        long beforeTime = System.currentTimeMillis();
        move(n, a, b, c);
        long afterTime = System.currentTimeMillis();
        System.out.println("Finished !! ");
        System.out.println("Execution Time = " + (afterTime - beforeTime));

    }

    static void move(int n, int a, int b, int c) {
        if (n > 0) {
            move(n - 1, a, c, b);
            System.out.println("move 1 disc from " + a + " to " + b);
            move(n - 1, c, b, a);
        }
    }
}
