import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> in;
    Stack<Integer> out;

    public ImplementQueueUsingStacks() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.add(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.add(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.add(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.empty();
    }

}
