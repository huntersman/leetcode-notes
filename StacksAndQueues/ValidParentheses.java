import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] tmp = s.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (deque.isEmpty()) {
                deque.add(tmp[i]);
            } else {
                char top = deque.getLast();
                if (top == '[' && tmp[i] == ']') {
                    deque.removeLast();
                } else if (top == '(' && tmp[i] == ')') {
                    deque.removeLast();
                } else if (top == '{' && tmp[i] == '}') {
                    deque.removeLast();
                } else {
                    deque.add(tmp[i]);
                }
            }
        }
        return deque.isEmpty();
    }
}
