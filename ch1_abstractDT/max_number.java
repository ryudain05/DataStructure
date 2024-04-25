package ch1_abstractDT;

import java.io.IOException;
import java.util.Scanner;

public class max_number {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a, max = 0;

        for (int i = 0; i < 3; i++) {
            a = sc.nextInt();
            max = Math.max(max, a);
        }

        System.out.println(max);

    }

}
