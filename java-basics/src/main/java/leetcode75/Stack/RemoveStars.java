package leetcode75.Stack;

import java.util.Stack;

public class RemoveStars {

    public String removeStars(String s) {

        Stack<Character> stk = new Stack<Character>();

        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '*') {
                stk.pop();
            } else {
                stk.push(s.charAt(i));
            }

        }

        Stack<Character> stknew = new Stack<Character>();

        while(!stk.isEmpty()){
            stknew.push(stk.peek());
            stk.pop();
            }


        String ns = "";

        while(!stknew.isEmpty()){
            ns = ns + stknew.peek();
            stknew.pop();
        }
        return ns;
    }

    public static void main(String[] args){

        RemoveStars rs = new RemoveStars();

        System.out.println(rs.removeStars("leet**cod*e"));
    }
}
