package ch5_CirucularDoublyLinkedList;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.print("문자열을 입력하시오 : ");
        input = scan.nextLine();
        String t = reverse(input);
        System.out.println("Input string: " + input);
        System.out.println("Reversed string: " + t);
    }

    private static String reverse(String s) {
        ArrayStack<Character> st = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        ;  // s의 i번 문자. 번호는 0번부터 시작
        String output = "";
        while (!st.isEmpty()) {
            output = output + st.pop();
        }
        return output;
    }
} // 코드 6-8
