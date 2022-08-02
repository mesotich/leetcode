import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        if (s.length()%2!=0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else {
                char sch;
                if (!stack.empty()) sch = stack.pop();
                else return false;
                if ((sch == '(' && ch != ')') || (sch == '{' && ch != '}') || (sch == '[' && ch != ']'))
                    return false;
            }
        }
        return stack.empty();
    }
}








