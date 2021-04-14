import java.util.Stack;

/**
 * LC20:有效的括号
 */
public class LC_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar == '{') {
                stack.push('}');
            } else if (curChar == '(') {
                stack.push(')');
            } else if (curChar == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || curChar != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
