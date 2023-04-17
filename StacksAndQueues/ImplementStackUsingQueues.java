import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> in;
    Queue<Integer> out;

    public ImplementStackUsingQueues() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public void push(int x) {
        in.add(x);
    }

    public int pop() {
        transfer();
        if (in.size() != 1) {
            transfer();
        }
        return in.poll();
    }

    public int top() {
        transfer();
        if (in.size() != 1) {
            transfer();
        }
        return in.peek();
    }

    private void transfer() {
        if (!in.isEmpty()) {
            while (in.size() != 1) {
                out.add(in.poll());
            }
        } else {
            while (!out.isEmpty()) {
                in.add(out.poll());
            }
        }
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
