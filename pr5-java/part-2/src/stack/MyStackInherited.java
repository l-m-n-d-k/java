package stack;

import java.util.ArrayList;

public class MyStackInherited extends ArrayList<Object> {
    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        return remove(getSize() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "Стек: " + super.toString();
    }
}
