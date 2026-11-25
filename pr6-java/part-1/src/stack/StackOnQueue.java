package stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackOnQueue {
    private Queue<Integer> items = new ArrayDeque<>();
    private Queue<Integer> buffer = new ArrayDeque<>();

    public void push(int x) {
        items.offer(x);
    }

    public int pop() {
        checkNotEmpty();
        moveAllButLast();
        int last = items.poll();
        swapQueues();
        return last;
    }

    public int top() {
        checkNotEmpty();
        moveAllButLast();
        int last = items.poll();
        buffer.offer(last);
        swapQueues();
        return last;
    }

    public boolean empty() {
        return items.isEmpty();
    }

    private void moveAllButLast() {
        while (items.size() > 1) {
            buffer.offer(items.poll());
        }
    }

    private void swapQueues() {
        Queue<Integer> temp = items;
        items = buffer;
        buffer = temp;
    }

    private void checkNotEmpty() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Стек (дно слева, вершина справа): [");
        int count = items.size();
        for (int i = 0; i < count; i++) {
            int value = items.poll();
            sb.append(i == 0 ? "" : ", ").append(value);
            items.offer(value);
        }
        return sb.append("]").toString();
    }
}
