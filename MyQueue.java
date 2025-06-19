public class MyQueue {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();
    private int front;

    public void push(int x) {
        if (in.isEmpty()) front = x;
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());
        return out.pop();
    }

    public int peek() {
        if (!out.isEmpty()) return out.peek();
        return front;
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
