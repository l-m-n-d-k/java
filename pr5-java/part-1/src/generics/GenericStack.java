package generics;

public class GenericStack<E> {
    private Object[] elements = new Object[2];
    private int size = 0;

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        return (E) elements[size - 1];
    }

    public void push(E o) {
        if (size == elements.length) {
            Object[] bigger = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                bigger[i] = elements[i];
            }
            elements = bigger;
        }
        elements[size++] = o;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        E o = (E) elements[size - 1];
        elements[--size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Стек: [");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(elements[i]);
        }
        return sb.append("]").toString();
    }
}
