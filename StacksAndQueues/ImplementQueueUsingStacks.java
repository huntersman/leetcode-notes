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
        transferStack();
        return out.pop();
    }

    public int peek() {
        transferStack();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.empty();
    }

    private void transferStack() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.add(in.pop());
            }
        }
    }

}
