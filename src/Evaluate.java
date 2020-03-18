
import java.util.Scanner;
import java.util.Stack;

/**
 * 求四则运算
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> tag = new Stack<>();
        tag.empty();
        Stack<String> numbers = new Stack<>();
        numbers.empty();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i <s.length() ; i++) {
            char c =  s.charAt(i);
            String s1 = String.valueOf(c);
            if (c == '(') {

            } else if (c == '+')
                tag.push(s1);
            else if (c == '-')
                tag.push(s1);
            else if (c == '*')
                tag.push(s1);
            else if (c == '/')
                tag.push(s1);
            else if (c == ')') {
                String data1 = numbers.pop();
                String data2 = numbers.pop();
                char c1 = tag.pop().charAt(0);
                if (c1 == '+') {
                    int res = Integer.valueOf(data1) + Integer.valueOf(data2);
                    String resString = String.valueOf(res);
                    numbers.push(resString);
                } else if (c1 == '-') {
                    int res = Integer.valueOf(data1) - Integer.valueOf(data2);
                    String resString = String.valueOf(res);
                    numbers.push(resString);
                } else if (c1 == '*') {
                    int res = Integer.valueOf(data1) * Integer.valueOf(data2);
                    String resString = String.valueOf(res);
                    numbers.push(resString);
                } else if (c1 == '/') {
                    int res = Integer.valueOf(data1) * Integer.valueOf(data2);
                    String resString = String.valueOf(res);
                    numbers.push(resString);
                }


            } else {
                numbers.push(s1);
            }


        }
        System.out.println(numbers.pop());


    }

}
