package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stacks {
//    String revered(String input )
//    {
//        // step 1 push
//        Stack<Character> s1 = new Stack<>();
//        for(int i=0; i<input.length(); i++) {
//            s1.push(input.charAt(i));
//        }
//            // step 2 pop
//            String result = "";
//            while (!s1.isEmpty())
//            {
//                result += s1.pop();
//            }
//            return result;

    //}
    String revered1(String input) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            s1.push(input.charAt(i));
        }
        // step 2 pop
        StringBuffer result = new StringBuffer();
        while (!s1.isEmpty()) {
          //  result += s1.pop();
            result.append(s1.pop());
        }
        return result.toString();
    }


    public static void main(String[] args) {
        stacks rev = new stacks();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text ");
        String text = input.next();
        System.out.println("revesed is  "+ rev.revered1(text));




    }
}
