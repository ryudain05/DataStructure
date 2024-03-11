import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, max = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Input: ");
            a = sc.nextInt();
            max = Math.max(max, a);
        }

        System.out.println("Max = " + max);
    }
}