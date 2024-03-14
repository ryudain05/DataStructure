package ch2_Factorial;

import java.util.Scanner;

public class Complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000000];
        System.out.print("Input n = ");
        int n = sc.nextInt();

        long time1 = System.currentTimeMillis();
        int result2 = sample2(a, n);
        long time2 = System.currentTimeMillis();
        int result3 = sample3(a, n);
        long time3 = System.currentTimeMillis();
        System.out.println("result1 = " + result2 + ", execution time = " + (time2 - time1));
        System.out.println("result2 = " + result3 + ", execution time = " + (time3 - time2));
    }

    static int sample2(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    static int sample3(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += a[i] * a[j];
            }
        }
        return sum;
    }
}
