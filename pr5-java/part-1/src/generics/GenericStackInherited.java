package generics;

import java.util.ArrayList;

public class GenericStackInherited<E> extends ArrayList<E> {
    public int getSize() {
        return size();
    }

    public E peek() {
        return get(getSize() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        return remove(getSize() - 1);
    }

    @Override
    public String toString() {
        return "Стек: " + super.toString();
    }
}
