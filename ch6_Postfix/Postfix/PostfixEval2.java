package ch6_Postfix.Postfix;

import ch5_CirucularDoublyLinkedList.ArrayStack;
import ch5_CirucularDoublyLinkedList.LinkedStack;

public class PostfixEval2 {
    public static void main(String[] args) {
        String postfix = "700 3 47 + 6 * - 4 /";
        System.out.println("Input string: " + postfix);
        int answer = evaluate(postfix);
        System.out.println("Answer: " + answer);

        String infix = "(((12*5)-(6/2)/(2*4))";

        postfix = infix_to_postfix(infix);

        System.out.println("\n입력 중위식 = " + infix);
        System.out.println("출력 후위식 = " + postfix);

        answer = evaluate(postfix);
        System.out.println("Answer: " + answer);

    }

    private static int evaluate(String postfix) {
        int A, B;
        ArrayStack<Integer> stack = new ArrayStack<>();
        boolean digitPreviously = false;
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                if (digitPreviously == true) {
                    int tmp = stack.pop();
                    tmp = 10 * tmp + (ch - '0');
                    stack.push(tmp);
                } else {
                    stack.push(ch - '0');
                }
                ;
                digitPreviously = true;
            } else if (isOperator(ch)) {
                A = stack.pop();
                B = stack.pop();
                int val = operation(A, B, ch);
                stack.push(val);
                digitPreviously = false;
            } else {
                digitPreviously = false;
            }
        }
        return stack.pop();
    }

    private static int operation(int a, int b, char ch) {
        int val = 0;
        switch (ch) {
            case '*':
                val = b * a;
                break;
            case '/':
                val = b / a;
                break;
            case '+':
                val = b + a;
                break;
            case '-':
                val = b - a;
                break;
        }
        return val;
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
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
} // 코드 6-9

