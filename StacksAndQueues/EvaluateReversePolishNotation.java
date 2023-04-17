import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("/")) {
                int last = nums.removeLast();
                int first = nums.removeLast();
                nums.add(first / last);
            } else if (tokens[i].equals("+")) {
                int last = nums.removeLast();
                int first = nums.removeLast();
                nums.add(first + last);
            } else if (tokens[i].equals("-")) {
                int last = nums.removeLast();
                int first = nums.removeLast();
                nums.add(first - last);
            } else if (tokens[i].equals("*")) {
                int last = nums.removeLast();
                int first = nums.removeLast();
                nums.add(first * last);
            } else {
                nums.add(Integer.parseInt(tokens[i]));
            }
        }
        return nums.getLast();
    }
}
