import java.util.Stack;

public class IsValid {
    /**
     * NAME: Valid Parentheses
     * Description:
     * Given a string containing just the characters '(',')','{','}',
     * '[',']',determine if the input string is valid.
     * <p>
     * An input string is valid if :
     * 1.Open brackets must be closed by the same type of brackets.
     * 2.Open brackets must be closed in the correct order.
     * <p>
     * Note that an empty string is also considered valid.
     * <p>
     * Example 1:
     * Input: "()"
     * Output: true
     * <p>
     * Example 2:
     * Input: "()[]{}"
     * Output: true
     * <p>
     * Example 3:
     * Input: "(]"
     * Output: false
     * <p>
     * Example 4:
     * Input: "([)]"
     * Output: false
     * <p>
     * Example 5:
     * Input: "{[]}"
     * Output: true
     */

    public static boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    parentheses.push(s.charAt(i));
                    break;
                case ')': {
                    if (parentheses.isEmpty() || parentheses.peek() != '(') {
                        return false;
                    } else {
                        parentheses.pop();
                    }
                    break;
                }
                case ']': {
                    if (parentheses.isEmpty() || parentheses.peek() != '[') {
                        return false;
                    } else {
                        parentheses.pop();
                    }
                    break;
                }
                case '}': {
                    if (parentheses.isEmpty() || parentheses.peek() != '{') {
                        return false;
                    } else {
                        parentheses.pop();
                    }
                    break;
                }
                default:
                    return false;
            }
        }
        if (parentheses.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
