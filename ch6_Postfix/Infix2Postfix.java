package ch6_Postfix;

import ch5_CirucularDoublyLinkedList.LinkedStack;
import java.util.Scanner;

public class Infix2Postfix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String infix;
        String postfix;

        //아래 입력 수식을 바꿔 가면서 실습하시오. 또는 그 아래에 있는 수식 입력 문장을 사용하여 실습하시오.
        infix = "(((3*5)-(6/2))/(2*4))";
//		System.out.print("문자열을 입력하시오 : ");
//		infix = scan.nextLine();

        System.out.println("입력 중위식 = " + infix);
        postfix = infix_to_postfix(infix);
        System.out.print("\n출력 후위식 : ");
        for (int i = 0; i < postfix.length(); i++) {
            System.out.print(postfix.charAt(i));
        }
        System.out.println();
    }

    private static String infix_to_postfix(String infix) {
        int infixSize = infix.length();
        String postfix = "";
        int j = 0;
        LinkedStack<Character> S = new LinkedStack<>();

        for (int i = 0; i < infixSize; i++) {
            char symbol = infix.charAt(i);

            switch (symbol) {
                case '+':
                case '-':
                case '*':
                case '/':
                    postfix = postfix + ' ';   //피연산자들 사이에 공백 추가함
                    S.push(symbol);
                    ;
                    break;
                case '(':
                    break;
                case ')':
                    postfix = postfix + ' ';   //연산자들 사이에 공백 추가함
                    postfix = postfix + S.pop();
                    ;
                    break;
                default:
                    postfix = postfix + symbol;
            }
        }
        while (S.isEmpty() != true) {
            postfix = postfix + S.pop();   //스택에 남아있는 연산자들 출력함
        }

        return postfix;
    }
}
